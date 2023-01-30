package gui;

import controller.ProdutoController;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import modelo.Produto;

public class RegrasTabelaProduto extends AbstractTableModel{
    private Vector<Produto> produtos;
    private String cabecalho[] = {"Nome", "Código","Preço","Sexo", "Tamanho", "Quantidade", "Modalidade"};
    private ProdutoController controllerProduto;
    
    public RegrasTabelaProduto(){
        this.produtos = new Vector<>();
        this.controllerProduto = new ProdutoController();
        
        carregaProdutos();
    }
    
    private void carregaProdutos(){
        
        this.controllerProduto.buscaTodosProdutos();
        this.produtos = controllerProduto.buscaTodosProdutos();
    }
    
    @Override
    public int getRowCount() {
        return this.produtos.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto prodTemp = this.produtos.get(rowIndex);
        
        switch(columnIndex){
            case 0: return prodTemp.getNome();
                
            case 1: return prodTemp.getCodigo();
                
            case 2: return prodTemp.getPreco();
                
            case 3: return prodTemp.getSexo();
                
            case 4: return prodTemp.getTamanho();
                
            case 5: return prodTemp.getQuantidade();
            
            case 6: return prodTemp.getModalidade();
            
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
        
        //as celulas PODEM ser modificadas
        return true;
    }

    //modificar os dados do modelo da tabela
    @Override
    public void setValueAt(Object novoValor, 
            int indiceLinha, int indiceColuna) {
        
        Produto prodModificar = this.produtos.get(indiceLinha);
        
        switch(indiceColuna){
            case 0: 
                prodModificar.setNome((String)novoValor); break;
            case 1:
                
                //prodModificar.setCodigo((String)novoValor);
                break;
            case 2: //modificar o anoLancamento(setAno)
                prodModificar.setPreco((Double)novoValor);break;
            case 3: //modificar o genero (setGenero)
                prodModificar.setSexo((String)novoValor);break;
            case 4: //modificar a disponibilidade (setDisponivel)
                prodModificar.setTamanho((String)novoValor);break;
            case 5:
                prodModificar.setQuantidade((int)novoValor);break;
            case 6:
                prodModificar.setModalidade((String)novoValor);
        }
        
        //invoca a atualização do objeto na base de dados
        controllerProduto.modificaProduto(prodModificar);
    }

    @Override
    public Class<?> getColumnClass(int indiceColuna) {
        switch(indiceColuna){
            case 2: return Double.class;
            case 5: return Integer.class;
            default: return String.class;
        }
    }
    
    public void insertProduto(Produto p){
        produtos.add(p);
    }
    
}
