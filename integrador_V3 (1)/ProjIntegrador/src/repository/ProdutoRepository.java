package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Produto;
import tool.FabricaBanco;

public class ProdutoRepository {
    public boolean insertNovoProduto(Produto novoProduto) {
        String sql = "INSERT INTO trabalho_loja_virtual.produto(codigo, preco, sexo, nome, tamanho, modalidade, quantidade) VALUES (?,?,?,?,?,?,?)";
        
        Connection conexBD = FabricaBanco.obterConexao();
        
        try {
            PreparedStatement transacao = conexBD.prepareStatement(sql);
            
            transacao.setString(1, novoProduto.getCodigo());
            transacao.setDouble(2, novoProduto.getPreco());
            transacao.setString(3, novoProduto.getSexo());
            transacao.setString(4, novoProduto.getNome());
            transacao.setString(5, novoProduto.getTamanho());
            transacao.setString(6, novoProduto.getModalidade());
            transacao.setInt(7, novoProduto.getQuantidade());
            
            
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
    
    public Vector<Produto> selectAllProdutos(){
        
        //vetor din. a ser preenchido com os filmes do Banco de dados
        Vector<Produto> produtosBanco = new Vector<>();
        
        String sql = "SELECT * FROM trabalho_loja_virtual.produto";
        
        Connection conexao = FabricaBanco.obterConexao();
        
        try{
            //aqui nos criamos a trans.
            PreparedStatement trans = conexao.prepareStatement(sql);
            
            //enviamos a tran. para o banco e recebemos os resultados
            ResultSet tuplas = trans.executeQuery();
            
            //passar por todas as tuplas e instanciar os objetos em mem.
            while(tuplas.next()){
                
                //double preco, String codigo, String nome, String modalidade, String sexo, String tamanho, int quantidade
                Produto produtoBD = new Produto(tuplas.getDouble("preco"), 
                        tuplas.getString("codigo"), 
                        tuplas.getString("nome"), 
                        tuplas.getString("modalidade"), 
                        tuplas.getString("sexo"), 
                        tuplas.getString("tamanho"),
                        tuplas.getInt("quantidade"));
                
                //add o obj FILME para o vetor que sera retornado
                produtosBanco.add(produtoBD);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return produtosBanco;
    }
    
    public void updateProduto(Produto prod){
        String sql = "UPDATE trabalho_loja_virtual.produto SET preco=?, sexo=?, nome=?, tamanho=?, modalidade=?, quantidade=? WHERE codigo=?";
        
        Connection conexao = FabricaBanco.obterConexao();
        
        try{
            PreparedStatement tran = conexao.prepareStatement(sql);
            
            tran.setDouble(1, prod.getPreco());
            tran.setString(2, prod.getSexo());
            tran.setString(3, prod.getNome());
            tran.setString(4, prod.getTamanho());
            tran.setString(5, prod.getModalidade());
            tran.setInt(6, prod.getQuantidade());
            tran.setString(7, prod.getCodigo());
            
            int tuplasModificadas = tran.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    public void updateQuantProduto(Produto prod){
        String sql = "UPDATE trabalho_loja_virtual.produto SET quantidade=quantidade-? WHERE codigo=?";
        
        Connection conexao = FabricaBanco.obterConexao();
        
        try{
            PreparedStatement tran = conexao.prepareStatement(sql);
            
            tran.setInt(1, prod.getQuantidade());
            tran.setString(2, prod.getCodigo());
            
            int tuplasModificadas = tran.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
