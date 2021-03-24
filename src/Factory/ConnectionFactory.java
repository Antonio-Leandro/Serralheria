package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ConnectionFactory {
    public Statement stmt;
    public ResultSet rs;
    public Connection getConnection() {
        try {
            //System.out.println("Conectando no banco de dados...");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/serralheria?serverTimezone=UTC", "root", "antonio");     
        } catch (Exception e) {
        	System.out.println("Erro de conexão com o banco de dados..." + e.getMessage());
                e.printStackTrace();
                return null;
        }
    }
}
