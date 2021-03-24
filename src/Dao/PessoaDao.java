package Dao;

import Factory.ConnectionFactory;
import Modelo.Pessoa;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class PessoaDao {
    ConnectionFactory connection = new ConnectionFactory();
    Connection c = connection.getConnection();
    
    public boolean busca (Pessoa pessoa) throws SQLException {
        
        String sql = "Select CPF from tbl_pessoa where CPF = ? or LOGIN = ? and SENHA = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, pessoa.getCPF());
        stmt.setString(2, pessoa.getLOGIN());
        stmt.setString(3, pessoa.getSENHA());
        ResultSet rs = stmt.executeQuery();
        return rs.next();
    }
    
    public void adiciona (Pessoa pessoa) throws SQLException {
        
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
                     + "TIPO_PESSOA,"
                     + "LOGIN,"
                     + "SENHA)"
                     + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
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
        stmt.setString(28, pessoa.getLOGIN());
        stmt.setString(29, pessoa.getSENHA());
        
        stmt.execute();
        stmt.close();
        c.close();
    }
    public void deleta (Pessoa pessoa) throws SQLException {
        String sql = "DELETE FROM tbl_pessoa WHERE CPF = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, pessoa.getCPF());
        stmt.execute();
        
        stmt.close();
        c.close();
    }
    public void atualiza (Pessoa pessoa) throws SQLException {
        String sql = "UPDATE tbl_pessoa SET NOME=?,"
                + "RG=?,"
                + "DATA_NASC=?,"
                + "DATA_DE_CADASTRO=?,"
                + "NACIONALIDADE=?,"
                + "NATURALIDADE=?,"
                + "ESTADO_CIVIL=?,"
                + "CEP=?,"
                + "LOGRADOURO=?,"
                + "NUMERO=?,"
                + "COMPLEMENTO=?,"
                + "BAIRRO=?,"
                + "CIDADE=?,"
                + "ESTADO=?,"
                + "TEL_FIXO=?,"
                + "CELULAR=?,"
                + "EMAIL=?,"
                + "EMPRESA=?,"
                + "CARGO=?,"
                + "END_COMERCIAL=?,"
                + "NUM_END_COM=?,"
                + "CEP_END_COM=?,"
                + "BAIRRO_END_COM=?,"
                + "CIDADE_END_COM=?,"
                + "ESTADO_END_COM=?,"
                + "TIPO_PESSOA=?,"
                + "LOGIN=?,"
                + "SENHA=?"
                + "WHERE CPF=?";
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
        stmt.setString(28, pessoa.getLOGIN());
        stmt.setString(29, pessoa.getSENHA());
        
        stmt.executeUpdate();
        stmt.close();
        c.close();
    }
    
    public List<Pessoa> listar() {
        String sql = "SELECT * FROM tbl_pessoa";
        List<Pessoa> pessoas = new ArrayList<>();
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
            Pessoa pessoa = new Pessoa();
            
                pessoa.setCPF(rs.getString("CPF"));
                pessoa.setNOME(rs.getString("NOME"));
                pessoa.setRG(rs.getString("RG"));
                pessoa.setDATA_DE_NASCIMENTO(rs.getString("DATA_NASC"));
                pessoa.setDATA_DE_CADASTRO(rs.getString("DATA_DE_CADASTRO"));
                pessoa.setNACIONALIDADE(rs.getString("NACIONALIDADE"));
                pessoa.setNATURALIDADE(rs.getString("NATURALIDADE"));
                pessoa.setESTADO_CIVIL(rs.getString("ESTADO_CIVIL"));
                pessoa.setCEP(rs.getString("CEP"));
                pessoa.setLOGRADOURO(rs.getString("LOGRADOURO"));
                pessoa.setNUMERO(rs.getString("NUMERO"));
                pessoa.setCOMPLEMENTO(rs.getString("COMPLEMENTO"));
                pessoa.setBAIRRO(rs.getString("BAIRRO"));
                pessoa.setCIDADE(rs.getString("CIDADE"));
                pessoa.setESTADO(rs.getString("ESTADO"));
                pessoa.setTELEFONE_FIXO(rs.getString("TEL_FIXO"));
                pessoa.setCELULAR(rs.getString("CELULAR"));
                pessoa.setEMAIL(rs.getString("EMAIL"));
                pessoa.setEMPRESA(rs.getString("EMPRESA"));
                pessoa.setCARGO(rs.getString("CARGO"));
                pessoa.setEND_COMERCIAL(rs.getString("END_COMERCIAL"));
                pessoa.setNUM_END_COM(rs.getString("NUM_END_COM"));
                pessoa.setCEP_END_COM(rs.getString("CEP_END_COM"));
                pessoa.setBAIRRO_END_COM(rs.getString("BAIRRO_END_COM"));
                pessoa.setCIDADE_END_COM(rs.getString("CIDADE_END_COM"));
                pessoa.setESTADO_END_COM(rs.getString("ESTADO_END_COM"));
                pessoa.setTIPO_PESSOA(rs.getString("TIPO_PESSOA"));
                pessoa.setLOGIN(rs.getString("LOGIN"));
                pessoa.setSENHA(rs.getString("SENHA"));
                
                pessoas.add(pessoa);
            }
                stmt.close();
                rs.close();
                c.close();
        } catch (SQLException ex) {
            System.out.println("Não foi possível carregar a lista de pessoas! " + ex.getMessage());
        } 
        return pessoas;
    }
}
