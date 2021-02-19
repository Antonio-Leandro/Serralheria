package Factory;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
    
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/serralheria?serverTimezone=UTC", "root", "antonio");     
        } catch (Exception e) {
        	e.printStackTrace();
            System.out.println("Erro de conexão com o banco de dados..." + e.getMessage());
        }   
        return null;
    }
}
