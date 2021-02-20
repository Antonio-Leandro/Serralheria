package Dao;

import Factory.ConnectionFactory;
import Modelo.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PessoaDao {
    ConnectionFactory connection = new ConnectionFactory();
    
    public void adiciona (Clientes clientes) throws SQLException {
        Connection c =  connection.getConnection();
        
        String sql = "INSERT INTO tbl_clientes ("
                     + "CPF,"
                     + "NOME,"
                     + "RG,"
                     + "DATA_NASC,"
                     + "DATA_DE_CADASTRO,"
                     + "NACIONALIDADE,"
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
                     + "NUM_COMERCIAL,"
                     + "CEP_COMERCIAL,"
                     + "BAIRRO_COMERCIAL,"
                     + "CIDADE_COMERCIAL,"
                     + "ESTADO_COMERCIAL)"
                     + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setLong(1, clientes.getCPF());
        stmt.setString(2, clientes.getNOME());
        stmt.setString(3, clientes.getRG());
        stmt.setString(4, clientes.getDATA_DE_NASCIMENTO());
        stmt.setString(5, clientes.getDATA_DE_CADASTRO());
        stmt.setString(6, clientes.getNACIONALIDADE());
        stmt.setString(7, clientes.getNATURALIDADE());
        stmt.setString(8, clientes.getESTADO_CIVIL());
        stmt.setString(9, clientes.getCEP());
        stmt.setString(10, clientes.getLOGRADOURO());
        stmt.setString(11, clientes.getNUMERO());
        stmt.setString(12, clientes.getCOMPLEMENTO());
        stmt.setString(13, clientes.getBAIRRO());
        stmt.setString(14, clientes.getCIDADE());
        stmt.setString(15, clientes.getESTADO());
        stmt.setString(16, clientes.getTELEFONE_FIXO());
        stmt.setString(17, clientes.getCELULAR());
        stmt.setString(18, clientes.getEMAIL());
        stmt.setString(19, clientes.getEMPRESA());
        stmt.setString(20, clientes.getCARGO());
        stmt.setString(21, clientes.getEND_COMERCIAL());
        stmt.setString(22, clientes.getNUM_COMERCIAL());
        stmt.setString(23, clientes.getCEP_COMERCIAL());
        stmt.setString(24, clientes.getBAIRRO_COMERCIAL());
        stmt.setString(25, clientes.getCIDADE_COMERCIAL());
        stmt.setString(26, clientes.getESTADO_COMERCIAL());
        
        stmt.execute();
        stmt.close();
        c.close();
    } 
}
