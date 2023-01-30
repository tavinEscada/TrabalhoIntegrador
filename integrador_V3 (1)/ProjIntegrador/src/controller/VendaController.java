package controller;

import java.util.Vector;
import modelo.Compra;
import repository.VendaRepository;

public class VendaController {
    private VendaRepository repository;
    
    public VendaController() {
        repository = new VendaRepository();
    }
    
    public boolean cadastraCompra(Compra novaCompra) {
        
        double valorTotal = novaCompra.getValorTotal();
        
        //verificando os dados do novo filme
        if (novaCompra == null) {
            return false;
        }
        
        if (novaCompra.getCodigo().isEmpty() || novaCompra.getCpfCliente().isEmpty() || novaCompra.getDataCompra().isEmpty()) {
            return false;
        } else {
            //return true;
        }
        
        boolean retornoBD = repository.insertNovaVenda(novaCompra);
        
        return retornoBD;
    }

    public Vector<Compra> buscaTodasCompras() {
        return repository.selectAllCompras();
    }
    
    public Vector<Compra> buscaComprasAno(){
        return repository.selectComprasAno();
    }
}
