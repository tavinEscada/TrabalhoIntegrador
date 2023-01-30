package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.Cliente;
import tool.FabricaBanco;

public class ClienteRepository {
    public boolean insertNovoCliente(Cliente novoCliente) {
        String sql = "INSERT INTO trabalho_loja_virtual.Cliente(cpf,nome,email,senha,cidade,estado,bairro,numero,cep) VALUES (?,?,?,?,?,?,?,?,?)";
        
        Connection conexBD = FabricaBanco.obterConexao();
        
        try {
            PreparedStatement transacao = conexBD.prepareStatement(sql);
            
            transacao.setString(1, novoCliente.getCpf());
            transacao.setString(2, novoCliente.getNome());
            transacao.setString(3, novoCliente.getEmail());
            transacao.setString(4, novoCliente.getSenha());
            transacao.setString(5, novoCliente.getCidade());
            transacao.setString(6, novoCliente.getEstado());
            transacao.setString(7, novoCliente.getBairro());
            transacao.setInt(8, novoCliente.getNum());
            transacao.setString(9, novoCliente.getCep());
            
            
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
    public Vector<Cliente> selectAllClientes(){
        
        //vetor din. a ser preenchido com os filmes do Banco de dados
        Vector<Cliente> clientesBanco = new Vector<>();
        
        String sql = "SELECT * FROM trabalho_loja_virtual.CLiente";
        
        Connection conexao = FabricaBanco.obterConexao();
        
        try{
            //aqui nos criamos a trans.
            PreparedStatement trans = conexao.prepareStatement(sql);
            
            //enviamos a tran. para o banco e recebemos os resultados
            ResultSet tuplas = trans.executeQuery();
            
            //passar por todas as tuplas e instanciar os objetos em mem.
            while(tuplas.next()){
                
                
                //String nome, String cpf, String cidade, String estado, String bairro, String cep, int num, String email, String senha
                Cliente clienteBD = new Cliente(tuplas.getString("nome"), 
                        tuplas.getString("cpf"), 
                        tuplas.getString("cidade"), 
                        tuplas.getString("estado"), 
                        tuplas.getString("bairro"), 
                        tuplas.getString("cep"),
                        tuplas.getInt("numero"),
                        tuplas.getString("email"),
                        tuplas.getString("senha"));
                
                //add o obj FILME para o vetor que sera retornado
                clientesBanco.add(clienteBD);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return clientesBanco;
    }
}
