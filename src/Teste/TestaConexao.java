package Teste;

import Factory.*;

public class TestaConexao {
    
    public static void main(String[]args) {
    
        ConnectionFactory connection = new ConnectionFactory();
            connection.getConnection();
    }
}
