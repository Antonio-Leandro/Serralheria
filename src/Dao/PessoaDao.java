package Dao;

import Factory.ConnectionFactory;
import Modelo.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PessoaDao {
    ConnectionFactory connection = new ConnectionFactory();
    
    public void adiciona (Clientes clientes) {
        Connection c =  connection.getConnection();
        String sql = "INSERT INTO tbl_clientes ("
                + "CPF,"
                + "NOME,"
                + "RG,"
                + "DATA_NASC,"
                + "NATURALIDADE,"
                + "ESTADO_CIVIL,"
                + "CEP,"
                + "LOGRADOURO,"
                + "NUMERO,"
                + "COMPLEMENTO,"
                + "BAIRRO,"
                + "CIDADE,"
                + "ESTADO,"
                + "TEL_FIXO,"
                + "CELULAR,"
                + "EMAIL,"
                + "EMPRESA,"
                + "CARGO,"
                + "END_COMERCIAL,"
                + "NUM_COMERCIAL"
                + "CEP_COMERCIAL,"
                + "BAIRRO_COMERCIAL,"
                + "CIDADE_COMERCIAL,"
                + "ESTADO_COMERCIAL,"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        /*try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, "164.881.778-50");
            stmt.setString(1, "Antonio Leandro Saldanha");
            stmt.setString(1, "24.259.699-X");
            stmt.setString(1, "17/10/1975");
            stmt.setString(1, "Brasileiro");
            stmt.setString(1, "Casado");
            stmt.setString(1, "04883-110");
            stmt.setString(1, "Rua Saverio De Donato");
            stmt.setString(1, "794");
            stmt.setString(1, "");
            stmt.setString(1, "Jardim Dos Alamos");
            stmt.setString(1, "São Paulo");
            stmt.setString(1, "UF");
            stmt.setString(1, "(11)5921-3535");
            stmt.setString(1, "(11)954.620.941");
            stmt.setString(1, "aleandrosaldanha@uol.com.br");
            stmt.setString(1, "ALS TECNOLOGIA");
            stmt.setString(1, "Direitor");
            stmt.setString(1, "Rua Quintana");
            stmt.setString(1, "753");
            stmt.setString(1, "04887-110");
            stmt.setString(1, "Brooklin");
            stmt.setString(1, "São Paulo");
            stmt.setString(1, "SP");
            
            stmt.execute();
            stmt.close();
            c.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível inserir o cadastro" +ex.getMessage());
        }*/
    } 
}
