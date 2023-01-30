package gui;

import controller.ProdutoController;
import java.awt.Color;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import modelo.Produto;

public class RegrasTabelaCompra extends AbstractTableModel {
    private Vector<Produto> produtosCarrinho;
    private String cabecalho[] = {"Nome", "Código", "Preço", "Quantidade"};
    private ProdutoController controllerProduto;
    private VendaPanel painelVenda;

    public RegrasTabelaCompra(VendaPanel painelVenda) {
        this.produtosCarrinho = new Vector<>();
        this.controllerProduto = new ProdutoController();
        this.painelVenda = painelVenda;
    }


    @Override
    public int getRowCount() {
        return this.produtosCarrinho.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto prodTemp = this.produtosCarrinho.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return prodTemp.getNome();

            case 1:
                return prodTemp.getCodigo();

            case 2:
                return prodTemp.getPreco();

            case 3:
                return prodTemp.getQuantidade();

            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int indiceColuna) {
        return cabecalho[indiceColuna];
    }

    //Definindo quais células podem ser modificadas (editadas)
    @Override
    public boolean isCellEditable(int indiceLinha, int indiceColuna) {

        //uma das celulas PODE ser modificada
        return true;
    }
    
    @Override
    public void setValueAt(Object novoValor,
            int indiceLinha, int indiceColuna) {

        Produto prodModificar = this.produtosCarrinho.get(indiceLinha);
        Produto prodDesejado = null;
        Vector<Produto> prodsEstoque = controllerProduto.buscaTodosProdutos();
        
        for(int i = 0; i < prodsEstoque.size(); i++){
            if(prodsEstoque.get(i).getCodigo().equals(prodModificar.getCodigo())){
                prodDesejado = prodsEstoque.get(i);
            }
        }
        
        switch (indiceColuna) {

            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                int quantNova = (int)novoValor;
                if(prodDesejado == null){
                    break;
                }
                
                if(prodDesejado.getQuantidade() < quantNova || quantNova == 0){
                    break;
                }else{
                    prodModificar.setQuantidade((int)novoValor);
                    
                    break;
                }
                
            default:
                return;
        }
        
        //invocar a atualização do objeto no label precoTotal
        painelVenda.atualizaCalculo();
        
        
        //controllerProduto.modificaProduto(prodModificar);
    }

    @Override
    public Class<?> getColumnClass(int indiceColuna) {
        switch (indiceColuna) {
            case 2:
                return Double.class;
            case 3:
                return Integer.class;
            default:
                return String.class;
        }
    }

    public Vector<Produto> getProdutosCarrinho() {
        return produtosCarrinho;
    }

    public void insertProduto(Produto p) {
        produtosCarrinho.add(p);
    }

}
