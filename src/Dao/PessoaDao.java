package Dao;

import Factory.ConnectionFactory;
import Modelo.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PessoaDao {
    ConnectionFactory connection = new ConnectionFactory();
    
    public void busca (Pessoa pessoa) throws SQLException {
        Connection c = connection.getConnection();
        
        String sql = "Select CPF from tbl_pessoa where CPF = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        //if (rs.next() !=null) {
            
        //}
    }
    
     
    public void adiciona (Pessoa pessoa) throws SQLException {
        Connection c =  connection.getConnection();
        
        String sql = "INSERT INTO tbl_pessoa ("
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
                     + "NUM_END_COM,"
                     + "CEP_END_COM,"
                     + "BAIRRO_END_COM,"
                     + "CIDADE_END_COM,"
                     + "ESTADO_END_COM,"
                     + "TIPO_PESSOA)"
                     + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, pessoa.getCPF());
        stmt.setString(2, pessoa.getNOME());
        stmt.setString(3, pessoa.getRG());
        stmt.setString(4, pessoa.getDATA_DE_NASCIMENTO());
        stmt.setString(5, pessoa.getDATA_DE_CADASTRO());
        stmt.setString(6, pessoa.getNACIONALIDADE());
        stmt.setString(7, pessoa.getNATURALIDADE());
        stmt.setString(8, pessoa.getESTADO_CIVIL());
        stmt.setString(9, pessoa.getCEP());
        stmt.setString(10, pessoa.getLOGRADOURO());
        stmt.setString(11, pessoa.getNUMERO());
        stmt.setString(12, pessoa.getCOMPLEMENTO());
        stmt.setString(13, pessoa.getBAIRRO());
        stmt.setString(14, pessoa.getCIDADE());
        stmt.setString(15, pessoa.getESTADO());
        stmt.setString(16, pessoa.getTELEFONE_FIXO());
        stmt.setString(17, pessoa.getCELULAR());
        stmt.setString(18, pessoa.getEMAIL());
        stmt.setString(19, pessoa.getEMPRESA());
        stmt.setString(20, pessoa.getCARGO());
        stmt.setString(21, pessoa.getEND_COMERCIAL());
        stmt.setString(22, pessoa.getNUM_END_COM());
        stmt.setString(23, pessoa.getCEP_END_COM());
        stmt.setString(24, pessoa.getBAIRRO_END_COM());
        stmt.setString(25, pessoa.getCIDADE_END_COM());
        stmt.setString(26, pessoa.getESTADO_END_COM());
        stmt.setString(27, pessoa.getTIPO_PESSOA());
        
        stmt.execute();
        stmt.close();
        c.close();
    } 
}
