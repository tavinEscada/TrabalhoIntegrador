package tool;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FabricaBanco {
    
    private static Connection con;
    
    
    public static Connection obterConexao(){
        if(con == null){
            try {
                con = DriverManager.getConnection(
                        "jdbc:postgresql://10.90.24.54/aula",
                        "aula", "aula");
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println("Erro no momento da conexao com o banco");
            }
        }
        
        return con;
    }  
}
