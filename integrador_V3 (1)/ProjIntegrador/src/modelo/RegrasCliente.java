package modelo;

import controller.ClienteController;
import java.util.Vector;

public class RegrasCliente {
    private ClienteController controllerCliente;
    private Vector<Cliente> clientes;

    public RegrasCliente(ClienteController controllerCliente) {
        this.controllerCliente = controllerCliente;
        this.clientes = this.controllerCliente.buscaTodosClientes();
    }
    
    public void addNovoCliente(Cliente novo){
        this.clientes.add(novo);
    }
    
    public Vector<Cliente> retornaClientes(){
        return this.clientes;
    }

    
}
