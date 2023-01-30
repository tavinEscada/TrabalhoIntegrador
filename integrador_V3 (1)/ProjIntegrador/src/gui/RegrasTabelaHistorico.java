package gui;

import controller.VendaController;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import modelo.Compra;

public class RegrasTabelaHistorico extends AbstractTableModel {

    private Vector<Compra> compras;
    private String cabecalho[] = {"Código","Valor","CPF do cliente","Data"};
    private VendaController controllerVenda;
    
    public RegrasTabelaHistorico(HistoricoPanel painelHistorico){
        this.compras = new Vector<>();
        this.controllerVenda = new VendaController();
        
        if(painelHistorico.ano().equals("Todos")){
            carregaCompras();
        }else{
            carregaComprasAno();
        }
    }
    
    private void carregaCompras(){
        this.controllerVenda.buscaTodasCompras();
        this.compras = controllerVenda.buscaTodasCompras();
    }
    
    private void carregaComprasAno(){
        this.controllerVenda.buscaComprasAno();
        this.compras = controllerVenda.buscaComprasAno();
    }
    
    
    @Override
    public int getRowCount() {
        return this.compras.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Compra compraTemp = this.compras.get(rowIndex);
        
        switch(columnIndex){
            case 0: return compraTemp.getCodigo();
                
            case 1: return compraTemp.getValorTotal();
                
            case 2: return compraTemp.getCpfCliente();
                
            case 3: return compraTemp.getDataCompra();
            
            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int indiceColuna) {
        return cabecalho[indiceColuna];
    }

    //Definindo quais células podem ser modificadas (editadas)
    @Override
    public boolean isCellEditable(int indiceLinha, int indiceColuna) {
        
        //as celulas nao PODEM ser modificadas
        return false;
        
    }
    
    @Override
    public Class<?> getColumnClass(int indiceColuna) {
        switch(indiceColuna){
            case 1: return Double.class;
            
            default: return String.class;
        }
    }
    
}
