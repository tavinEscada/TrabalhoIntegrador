package modelo;

import controller.VendaController;
import java.util.Vector;

public class RegrasCompra {
    private VendaController controllerVenda;
    private Vector<Compra> compras;

    public RegrasCompra(VendaController controllerVenda) {
        this.controllerVenda = controllerVenda;
        this.compras = this.controllerVenda.buscaTodasCompras();
    }
    
    public void addNovaCompra(Compra nova){
        this.compras.add(nova);
    }
    
    public Vector<Compra> retornaCompras(){
        return this.compras;
    }
}
