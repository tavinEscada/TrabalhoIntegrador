package controller;

import java.util.Vector;
import modelo.Cliente;
import modelo.Produto;
import repository.ProdutoRepository;

public class ProdutoController {

    private ProdutoRepository repository;
    
    public ProdutoController() {
        repository = new ProdutoRepository();
    }
    
    public boolean cadastraProduto(Produto novoProduto) {
        
        int quant = novoProduto.getQuantidade();
        double preco = novoProduto.getPreco();

        
        if (novoProduto.getNome().isEmpty() || novoProduto.getCodigo().isEmpty()
                || novoProduto.getSexo().isEmpty() || novoProduto.getTamanho().isEmpty() || novoProduto.getModalidade().isEmpty()) {
            
            return false;
        } else {
            //return true;
        }
        
        boolean retornoBD = repository.insertNovoProduto(novoProduto);
        
        return retornoBD;
    }

    public Vector<Produto> buscaTodosProdutos() {
        return repository.selectAllProdutos();
    }
    
    public void modificaProduto(Produto prod) {
        
        if (prod != null) {
            repository.updateProduto(prod);
        }
        
    }

    //metodo que recebe o vetor do produto no regra tabela
    public void modificaQuant(Vector<Produto> prodCarrinho) {
        
        for (int i = 0; i < prodCarrinho.size(); i++) {
            if (prodCarrinho.get(i) != null) {
                repository.updateQuantProduto(prodCarrinho.get(i));
            }
        }
        
    }
    
}
