package controller;

import java.util.Vector;
import modelo.Cliente;
import repository.ClienteRepository;

public class ClienteController {
    private ClienteRepository repository;
    
    public ClienteController(){
        repository = new ClienteRepository();
    }
    
    public boolean cadastraCliente(Cliente novoCliente){
        
        int numero = novoCliente.getNum();
        
        //verificando os dados do novo filme
        if(novoCliente == null){
            return false;
        }
        if(novoCliente.getNome().isEmpty() || novoCliente.getCpf().isEmpty() || novoCliente.getCep().isEmpty() 
                || novoCliente.getEmail().isEmpty() || novoCliente.getBairro().isEmpty() || novoCliente.getCidade().isEmpty()
                || novoCliente.getEstado().isEmpty() || novoCliente.getSenha().isEmpty() || novoCliente.getEmail().isEmpty()){
            
            
            return false;
        }else{
            //return true;
        }
        
        boolean retornoBD = repository.insertNovoCliente(novoCliente);
        
        return retornoBD;
    }
    
    public Vector<Cliente> buscaTodosClientes(){
        return repository.selectAllClientes();
    }
}
