package modelo;

import java.util.Date;
import java.util.Vector;
//classe compra
public class Compra {

    //atributos
    private String formaPagamento;
    private String codigo;
    private Date prazoEntrega;
    private double valorTotal;
    String dataCompra;

    //representando as associões entre classes
    private Vector<Produto> carrinhoCompra;
    private Cliente cliente;
    

    //construtores
    public Compra(Cliente comprador, String dataCompra) {
        this.cliente = comprador;
        this.dataCompra = dataCompra;
        this.carrinhoCompra = new Vector<>();
        this.prazoEntrega = new Date();
    }

    //encapsulamento

    public String getCodigo() {
        return codigo;
    }

    public Date getDiaVenda() {
        return prazoEntrega;
    }

    public double getPrecoTotal() {
        return valorTotal;
    }

    public Vector<Produto> getProdutosComprados() {
        return carrinhoCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProdutoCarrinho(Produto produtoEstoque) {
        //double preco, String codigo, String nome, String modalidade, String sexo

        Produto prodComprado = new Produto(
            produtoEstoque.getPreco(), produtoEstoque.getCodigo(), produtoEstoque.getNome(), 
                produtoEstoque.getModalidade(), produtoEstoque.getSexo());

            //add o produto comprado no carrinho de compras
            this.carrinhoCompra.add(prodComprado);
            
            //atualizando (incrementando) o valor Total da venda
            this.valorTotal += prodComprado.getPreco();

    }
    
    public String toString(){
        String resultado = "";
        
        //passando por todos os produtos da venda
        for(int i = 0; i < this.carrinhoCompra.size();i++){
            
            Produto prodTemp = this.carrinhoCompra.get(i);
            
            resultado += prodTemp.getNome() + " (" + prodTemp.getCodigo() + ")" + 
                    "\n" + "Modalid.: " + prodTemp.getModalidade() + "\nSexo: " + 
                    prodTemp.getSexo() + "\nPreço: " + prodTemp.getPreco() + "\n";
            
        }
        
        resultado += "Preço Total da Venda: R$ " + this.valorTotal;
        
        return resultado;
    }

}