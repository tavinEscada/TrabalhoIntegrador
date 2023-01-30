package repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.Compra;
import modelo.Produto;
import tool.FabricaBanco;

public class VendaRepository {
    public boolean insertNovaVenda(Compra novaCompra) {
        String sql = "INSERT INTO trabalho_loja_virtual.compra(valortotal, data, cpfcliente, codigo) VALUES (?,?,?,?)";
        
        Connection conexBD = FabricaBanco.obterConexao();
        
        try {
            PreparedStatement transacao = conexBD.prepareStatement(sql);
            
            transacao.setDouble(1, novaCompra.getValorTotal());
            transacao.setString(2, novaCompra.getDataCompra());
            transacao.setString(3, novaCompra.getCpfCliente());
            transacao.setString(4, novaCompra.getCodigo());
            
            //enviando a transação (SQL) configurada para o SGBD
            transacao.execute();
            
            ResultSet tuplaChave = transacao.getGeneratedKeys();
            
            return true;
            
        } catch (SQLException ex) {
            System.out.println("erro: "+ ex.getMessage());
            JOptionPane.showMessageDialog(null, "erro:" + ex.getMessage());
            ex.printStackTrace();
            return false;
        }
    }
    
    public Vector<Compra> selectAllCompras(){
        
        //vetor din. a ser preenchido com os filmes do Banco de dados
        Vector<Compra> comprasBanco = new Vector<>();
        
        String sql = "SELECT * FROM trabalho_loja_virtual.compra";
        
        Connection conexao = FabricaBanco.obterConexao();
        
        try{
            //aqui nos criamos a trans.
            PreparedStatement trans = conexao.prepareStatement(sql);
            
            //enviamos a tran. para o banco e recebemos os resultados
            ResultSet tuplas = trans.executeQuery();
            
            //passar por todas as tuplas e instanciar os objetos em mem.
            while(tuplas.next()){
                
                Compra compraBD = new Compra(tuplas.getDouble("valortotal"), 
                        tuplas.getString("data"), 
                        tuplas.getString("cpfcliente"), 
                        tuplas.getString("codigo"));
                
                
                comprasBanco.add(compraBD);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return comprasBanco;
    }
    
    public Vector<Compra> selectComprasAno(){
        
        Vector<Compra> comprasBanco = new Vector<>();
        
        String sql = "SELECT * FROM trabalho_loja_virtual.compra WHERE data LIKE ?";
        
        Connection conexao = FabricaBanco.obterConexao();
        
        try{
            //aqui nos criamos a trans.
            PreparedStatement trans = conexao.prepareStatement(sql);
            
            //enviamos a tran. para o banco e recebemos os resultados
            ResultSet tuplas = trans.executeQuery();
            
            //passar por todas as tuplas e instanciar os objetos em mem.
            while(tuplas.next()){
                
                Compra compraBD = new Compra(tuplas.getDouble("valortotal"), 
                        tuplas.getString("data"), 
                        tuplas.getString("cpfcliente"), 
                        tuplas.getString("codigo"));
                
                
                comprasBanco.add(compraBD);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return comprasBanco;
    }
    
}
