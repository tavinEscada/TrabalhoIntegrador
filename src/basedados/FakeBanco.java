package basedados;

import java.util.Vector;
import modelo.Cliente;
import modelo.Compra;
import modelo.Produto;

public class FakeBanco {
    
    private static Vector<Produto> produtosBanco = new Vector<>();
    private static Vector<Cliente> clientes = new Vector<>();
    private static Vector<Compra> compras = new Vector<>();

    public static void iniciaBancoDados(){
 
        produtosBanco.add(new Produto(120.00, "ddqrt3447", "Camisa Nike", "Casual", "F"));
        produtosBanco.add(new Produto(5, "ddfgs897", "Camisa Lakers", "Basquete", "F"));
        produtosBanco.add(new Produto(120.00, "ddff457", "Camisa Bulls", "Basquete", "F"));
        produtosBanco.add(new Produto(120.00, "atdy535", "Tênis Corrida", "Casual", "M"));
        
        
        clientes.add(new Cliente("Robertio", "123.456.789-00", "Juazeiro do Norte", "Ceará", "Limoeiro", "12634-542", 12, "robertin123@gmail.com", "robertindograu123"));
        clientes.add(new Cliente("Seu José", "123.735.643-45", "Ouro Preto", "Minas Gerais", "Guanabara", "17460-978", 58, "seujuse@hotmail.com", "zezinmaloka13"));
        clientes.add(new Cliente("Carlos", "214.634.963-12", "Ouro Branco", "Minas Gerais", "Pioneiros", "34530-906", 58, "carlin64@hotmail.com", "carlojoga56"));
        
        
        
    }
    
    
    public static Vector<Produto> selectAllProdutos(){
        
        return produtosBanco;
    }
    
    //SELECT * FROM cliente;
    public static Vector<Cliente> selectAllClientes(){
        //Vector<Cliente> clientes = new Vector<>();

        return clientes;
    }
    

    public static Produto retornaProdutoCodigo(String cod){
        Vector<Produto> produtosEstoque = selectAllProdutos();

        for(Produto p : produtosEstoque){  
            if(p.getCodigo().equals(cod)){
                return p;
            }
        }
        return null;
    }
    
    public static void insertProduto(Produto novoProduto){
        produtosBanco.add(novoProduto);
        
    }
    
    public static void insertCompra(Compra novaCompra){
        compras.add(novaCompra);
    }
    
    public static void insertCliente(Cliente novoCliente){
        clientes.add(novoCliente);
    }
    
    
    public static void updatePrecoProduto(Produto prod, double novoPreco){
        prod.setPreco(novoPreco);
    }
    public static void updateModalidadeProduto(Produto prod, String novaMod){
        prod.setModalidade(novaMod);
    }

}