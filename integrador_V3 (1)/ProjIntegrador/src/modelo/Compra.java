package modelo;

import java.util.Date;
import java.util.Vector;

public class Compra {

    //atributos
    private String codigo;
    private double valorTotal;
    private String dataCompra;
    private String cpfCliente;

    //construtores
    public Compra(double valorTotal, String dataCompra, String cpfCliente, String codigo) {
        this.codigo = codigo;
        this.valorTotal = valorTotal;
        this.dataCompra = dataCompra;
        this.cpfCliente = cpfCliente;
    }

    //encapsulamento
    public String getCodigo() {
        return codigo;
    }    

    public String getDataCompra() {
        return dataCompra;
    }
    
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {    
        this.valorTotal = valorTotal;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

}
