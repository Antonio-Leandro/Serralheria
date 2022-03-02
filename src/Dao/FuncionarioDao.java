package Dao;

import Factory.ConnectionFactory;
import Modelo.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDao {
    
    ConnectionFactory connection =  new ConnectionFactory();
    Connection c = connection.getConnection();

    public boolean BuscaFuncionario(Pessoa pessoa) throws SQLException {
        String sql = "SELECT CPF FROM tbl_funcionario WHERE CPF=?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, pessoa.getCPF());
        ResultSet rs = stmt.executeQuery();
        return rs.next();
    }
    
    public void adiciona (Pessoa pessoa) throws SQLException {
        String sql = "INSERT INTO tbl_funcionario("
                    +"ID_FUNCIONARIO,"
                    +"CPF,"
                    +"NOME,"
                    +"RG,"
                    +"DATA_NASC,"
                    +"DATA_DE_CADASTRO,"
                    +"NACIONALIDADE,"
                    +"NATURALIDADE,"
                    +"ESTADO_CIVIL,"
                    +"CARGO,"
                    +"CEP,"
                    +"LOGRADOURO,"
                    +"NUMERO,"
                    +"COMPLEMENTO,"
                    +"BAIRRO,"
                    +"CIDADE,"
                    +"ESTADO,"
                    +"TEL_FIXO,"
                    +"CELULAR,"
                    +"EMAIL)"
                    +"VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement stmt = c.prepareStatement(sql);
        
        stmt.setString(1, pessoa.getID());
        stmt.setString(2, pessoa.getCPF());
        stmt.setString(3, pessoa.getNOME());
        stmt.setString(4, pessoa.getRG());
        stmt.setString(5, pessoa.getDATA_DE_NASCIMENTO());
        stmt.setString(6, pessoa.getDATA_DE_CADASTRO());
        stmt.setString(7, pessoa.getNACIONALIDADE());
        stmt.setString(8, pessoa.getNATURALIDADE());
        stmt.setString(9, pessoa.getESTADO_CIVIL());
        stmt.setString(10, pessoa.getCARGO());
        stmt.setString(11, pessoa.getCEP());
        stmt.setString(12, pessoa.getLOGRADOURO());
        stmt.setString(13, pessoa.getNUMERO());
        stmt.setString(14, pessoa.getCOMPLEMENTO());
        stmt.setString(15, pessoa.getBAIRRO());
        stmt.setString(16, pessoa.getCIDADE());
        stmt.setString(17, pessoa.getESTADO());
        stmt.setString(18, pessoa.getTELEFONE_FIXO());
        stmt.setString(19, pessoa.getCELULAR());
        stmt.setString(20, pessoa.getEMAIL());
        
        stmt.execute();
        stmt.close();
        c.close();
    }
    
    public void DeletaFuncionario(Pessoa pessoa) throws SQLException {
        String sql = "DELETE FROM tbl_funcionario WHERE CPF=?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, pessoa.getCPF());
        
        stmt.execute();
        stmt.close();
        c.close();
    }
    
    public List<Pessoa> listar() throws SQLException {
        String sql = "SELECT * FROM tbl_funcionario";
        List<Pessoa> pessoas = new ArrayList<>();
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()) {
            Pessoa pessoa = new Pessoa();
            
            pessoa.setID(rs.getString("ID_FUNCIONARIO"));
            pessoa.setCPF(rs.getString("CPF"));
            pessoa.setNUMERO(rs.getString("NOME"));
            pessoa.setRG(rs.getString("RG"));
            pessoa.setDATA_DE_NASCIMENTO(rs.getString("DATA_NASC"));
            pessoa.setDATA_DE_CADASTRO(rs.getString("DATA_DE_CADASTRO"));
            pessoa.setNACIONALIDADE(rs.getString("NACIONALIDADE"));
            pessoa.setNATURALIDADE(rs.getString("NATURALIDADE"));
            pessoa.setESTADO_CIVIL(rs.getString("ESTADO_CIVIL"));
            pessoa.setCARGO(rs.getString("CARGO"));
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
            
            pessoas.add(pessoa);
        }
        stmt.close();
        rs.close();
        c.close();
        
        return pessoas;
    }
}
