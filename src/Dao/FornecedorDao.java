package Dao;

import Factory.ConnectionFactory;
import Modelo.Pessoa;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class FornecedorDao {
    ConnectionFactory connection = new ConnectionFactory();
    Connection c = connection.getConnection();
    
    /*public boolean login (Pessoa pessoa) throws SQLException {
        String sql = "Select * from tbl_pessoa where LOGIN=? and SENHA=?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, pessoa.getLOGIN());
        stmt.setString(2, pessoa.getSENHA());
        ResultSet rs = stmt.executeQuery();
        return rs.next();
    }*/
    
    public boolean busca (Pessoa pessoa) throws SQLException {
        String sql = "Select CNPJ from tbl_fornecedor where CNPJ =?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, pessoa.getCNPJ());
        ResultSet rs = stmt.executeQuery();
        return rs.next();
    }
    
    public void adiciona (Pessoa pessoa) throws SQLException {
        
        String sql = "INSERT INTO tbl_fornecedor ("
                     + "CNPJ,"
                     + "RAZAO_SOCIAL,"
                     + "NOME_FANTASIA,"
                     + "DATA_FUNDACAO,"
                     + "DATA_CADASTRO,"
                     + "CEP,"
                     + "LOGRADOURO,"
                     + "NUMERO,"
                     + "COMPLEMENTO,"
                     + "BAIRRO,"
                     + "CIDADE,"
                     + "UF,"
                     + "TELEFONE,"
                     + "SITE,"
                     + "EMAIL_RESP)"
                     + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, pessoa.getCNPJ());
        stmt.setString(2, pessoa.getRAZAO_SOCIAL());
        stmt.setString(3, pessoa.getNOME_FANTASIA());
        stmt.setString(4, pessoa.getDATA_FUNDACAO());
        stmt.setString(5, pessoa.getDATA_DE_CADASTRO());
        stmt.setString(6, pessoa.getCEP());
        stmt.setString(7, pessoa.getLOGRADOURO());
        stmt.setString(8, pessoa.getNUMERO());
        stmt.setString(9, pessoa.getCOMPLEMENTO());
        stmt.setString(10, pessoa.getBAIRRO());
        stmt.setString(11, pessoa.getCIDADE());
        stmt.setString(12, pessoa.getESTADO());
        stmt.setString(13, pessoa.getTELEFONE_FIXO());
        stmt.setString(14, pessoa.getSITE());
        stmt.setString(15, pessoa.getEMAIL_RESP());
        
        stmt.execute();
        stmt.close();
        c.close();
    }
    public void deleta (Pessoa pessoa) throws SQLException {
        String sql = "DELETE FROM tbl_fornecedor WHERE CNPJ = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, pessoa.getCNPJ());
        stmt.execute();
        
        stmt.close();
        c.close();
    }
    public void atualiza (Pessoa pessoa) throws SQLException {
        String sql = "UPDATE tbl_fornecedor SET RAZAO_SOCIAL=?,"
                //+ "CNPJ=?,"
                + "NOME_FANTASIA=?,"
                + "DATA_CADASTRO=?,"
                + "DATA_FUNDACAO=?,"
                + "CEP=?,"
                + "LOGRADOURO=?,"
                + "NUMERO=?,"
                + "COMPLEMENTO=?,"
                + "BAIRRO=?,"
                + "CIDADE=?,"
                + "UF=?,"
                + "TELEFONE=?,"
                + "SITE=?,"
                + "EMAIL_RESP=?"
                + "WHERE CNPJ=?";
        PreparedStatement stmt = c.prepareStatement(sql);
        
        stmt.setString(1, pessoa.getCNPJ());
        stmt.setString(2, pessoa.getRAZAO_SOCIAL());
        stmt.setString(3, pessoa.getNOME_FANTASIA());
        stmt.setString(4, pessoa.getDATA_DE_CADASTRO());
        stmt.setString(5, pessoa.getDATA_FUNDACAO());
        stmt.setString(6, pessoa.getCEP());
        stmt.setString(7, pessoa.getLOGRADOURO());
        stmt.setString(8, pessoa.getNUMERO());
        stmt.setString(9, pessoa.getCOMPLEMENTO());
        stmt.setString(10, pessoa.getBAIRRO());
        stmt.setString(11, pessoa.getCIDADE());
        stmt.setString(12, pessoa.getESTADO());
        stmt.setString(13, pessoa.getTELEFONE_FIXO());
        stmt.setString(14, pessoa.getSITE());
        stmt.setString(15, pessoa.getEMAIL_RESP());
        
        stmt.executeUpdate();
        stmt.close();
        c.close();
    }
    
    public List<Pessoa> listar() {
        String sql = "SELECT * FROM tbl_fornecedor";
        List<Pessoa> pessoas = new ArrayList<>();
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
            Pessoa pessoa = new Pessoa();
            
                pessoa.setCNPJ(rs.getString("CNPJ"));
                pessoa.setRAZAO_SOCIAL(rs.getString("RAZAO_SOCIAL"));
                pessoa.setNOME_FANTASIA(rs.getString("NOME_FANTASIA"));
                pessoa.setDATA_FUNDACAO(rs.getString("DATA_FUNDACAO"));
                pessoa.setDATA_DE_CADASTRO(rs.getString("DATA_CADASTRO"));
                //pessoa.setNACIONALIDADE(rs.getString("CEP"));
                pessoa.setLOGRADOURO(rs.getString("LOGRADOURO"));
                pessoa.setNUMERO(rs.getString("NUMERO"));
                pessoa.setCEP(rs.getString("CEP"));
                pessoa.setESTADO(rs.getString("UF"));
                pessoa.setCOMPLEMENTO(rs.getString("COMPLEMENTO"));
                pessoa.setBAIRRO(rs.getString("BAIRRO"));
                pessoa.setCIDADE(rs.getString("CIDADE"));
                pessoa.setTELEFONE_FIXO(rs.getString("TELEFONE"));
                pessoa.setSITE(rs.getString("SITE"));
                pessoa.setEMAIL_RESP(rs.getString("EMAIL_RESP"));
                
                pessoas.add(pessoa);
            }
                stmt.close();
                rs.close();
                c.close();
        } catch (SQLException ex) {
            System.out.println("Não foi possível carregar a lista de fornecedores! " + ex.getMessage());
        } 
        return pessoas;
    }
}