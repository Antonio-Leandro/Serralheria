package Dao;

import Factory.ConnectionFactory;
import Modelo.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PessoaDao {
    ConnectionFactory connection = new ConnectionFactory();
    public void busca (Pessoa pessoa) {
        Connection c = connection.getConnection();
        String sql = "Select * from tbl_pessoa where CPF = ?";
    }
    public void adiciona (Pessoa pessoa) throws SQLException {
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
        stmt.setString(22, pessoa.getNUM_COMERCIAL());
        stmt.setString(23, pessoa.getCEP_COMERCIAL());
        stmt.setString(24, pessoa.getBAIRRO_COMERCIAL());
        stmt.setString(25, pessoa.getCIDADE_COMERCIAL());
        stmt.setString(26, pessoa.getESTADO_COMERCIAL());
        
        stmt.execute();
        stmt.close();
        c.close();
    } 
}
