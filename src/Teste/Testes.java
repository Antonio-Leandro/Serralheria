package Teste;

import Factory.ConnectionFactory;

public class Testes {
    
    public static void main(String[] args) {
        ConnectionFactory connection = new ConnectionFactory();
        connection.getConnection();
        System.out.println("Conectando com sucesso...");
    }
    
}
