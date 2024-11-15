package modelo;

//classe produto
public class Produto {
    //atributos
    private double preco;
    private String codigo;
    private String nome;
    private String modalidade;
    private String sexo;
 
    
    
    //construtores

    public Produto(double preco, String codigo, String nome, String modalidade, String sexo) {
        this.preco = preco;
        this.codigo = codigo;
        this.nome = nome;
        this.modalidade = modalidade;
        this.sexo = sexo;
        
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //encapsulamento
    public double getPreco() {
        return preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    
    
    public String toString(){
        String resultado = "";
        resultado += this.codigo + " - " + this.nome + "  ->  "
        + " preço: " + this.preco;
        
        return resultado;
    }
}
