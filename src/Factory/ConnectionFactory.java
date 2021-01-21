package Factory;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
    
    public Connection getConnection() {
        try {
             return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "root", "Antonio");
             
        } catch (Exception e) {
            System.out.println("Erro de conexão com o banco de dados...");
        }   
        return null;
    }
}
