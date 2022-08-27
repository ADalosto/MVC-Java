package conexao;


import com.mysql.jdbc.Connection;
import static java.lang.System.exit;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Connection getConnection() {    
       String url = "jdbc:mysql://143.106.241.3:3306/cl201110";
       String usuario = "cl201110";
       String senha = "cl*08102005";
        try {  
            return (Connection) DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            System.out.println("Erro de conexão "+ ex.toString());
            exit (1);
            return null;
        }
    } 
}
