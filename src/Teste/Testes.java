package Teste;

import Dao.PessoaDao;
import Modelo.Pessoa;
import java.sql.SQLException;

public class Testes {
    
    public static void main(String[] args) throws SQLException {
                    
        
        Pessoa pessoa = new Pessoa();
            pessoa.setCPF("164.881.778-56");
            pessoa.setNOME("Antonio Leandro Saldanha");
            pessoa.setRG("24.259.699-X");
            pessoa.setDATA_DE_NASCIMENTO("19/05/1975");
            pessoa.setDATA_DE_CADASTRO("20/01/2021");
            pessoa.setNACIONALIDADE("Brasileiro");
            pessoa.setNATURALIDADE("Ceará");
            pessoa.setESTADO_CIVIL("Casado");
            pessoa.setCEP("04883-111");
            pessoa.setLOGRADOURO("Rua Saverio De Donato");
            pessoa.setNUMERO("798");
            pessoa.setCOMPLEMENTO(" ");
            pessoa.setBAIRRO("Jardim Dos Alamos");
            pessoa.setCIDADE("São Paulo");
            pessoa.setESTADO("UF");
            pessoa.setTELEFONE_FIXO("(11)5921-3535");
            pessoa.setCELULAR("(11)954.620.941");
            pessoa.setEMAIL("aleandrosaldanha@uol.com.br");
            pessoa.setEMPRESA("ALS TECNOLOGIA");
            pessoa.setCARGO("Direitor");
            pessoa.setEND_COMERCIAL("Rua Quintana");
            pessoa.setNUM_COMERCIAL("753");
            pessoa.setCEP_COMERCIAL("04887-110");
            pessoa.setBAIRRO_COMERCIAL("Brooklin");
            pessoa.setCIDADE_COMERCIAL("São Paulo");
            pessoa.setESTADO_COMERCIAL("SP");
            
            PessoaDao pessoadao = new PessoaDao();
            try {
                 pessoadao.adiciona(pessoa);
                 System.out.println("Cadastro salvo com sucesso! ");
            } catch (SQLException ex) {
              System.out.println("Não foi possível salvar o cadastro..." + ex.getMessage());
              ex.printStackTrace();  
            }
    }  
}
