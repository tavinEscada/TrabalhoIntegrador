package modelo;

public class Produto {
    //atributos
    private double preco;
    private String codigo;
    private String nome;
    private String modalidade;
    private String sexo;
    private String tamanho;
    private int quantidade;
    
    
    //construtores
    public Produto(double preco, String codigo, String nome, String modalidade, String sexo, String tamanho, int quantidade) {
        this.preco = preco;
        this.codigo = codigo;
        this.nome = nome;
        this.modalidade = modalidade;
        this.sexo = sexo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getTamanho() {
        return tamanho;
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

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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
