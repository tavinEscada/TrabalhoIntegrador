package modelo;

import controller.ProdutoController;
import java.util.Vector;
import modelo.Produto;

public class RegrasProduto {
    private ProdutoController controllerProduto;
    private Vector<Produto> produtos;

    public RegrasProduto(ProdutoController controllerProduto) {
        this.controllerProduto = controllerProduto;
        this.produtos = this.controllerProduto.buscaTodosProdutos();
    }
    
    public void addNovoProduto(Produto novo){
        this.produtos.add(novo);
    }
    
    public Vector<Produto> retornaProdutos(){
        return this.produtos;
    }
}
