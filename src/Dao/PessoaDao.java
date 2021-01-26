package Dao;

import Factory.ConnectionFactory;
import Modelo.Clientes;
import java.sql.Connection;


public class PessoaDao {
    ConnectionFactory connection = new ConnectionFactory();
    
    public void adiciona (Clientes clientes) {
        Connection c =  connection.getConnection();
        String sql = "INSERT INTO tbl_clientes ("
                + "CPF,"
                + "NOME,"
                + "RG,"
                + "DATA_NASC,"
                + "DATA_DE_CADASTRO,"
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
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    } 
}
