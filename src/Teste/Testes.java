package Teste;

import Dao.PessoaDao;
import Factory.ConnectionFactory;
import Modelo.Clientes;
import java.sql.SQLException;

public class Testes {
    
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connection = new ConnectionFactory();
        if (connection != null) {
        System.out.println("Conectado com sucesso...");
        Clientes clientes = new Clientes();
            clientes.setCPF("164.881.778-50");
            clientes.setNOME("Antonio Leandro Saldanha");
            clientes.setRG("24.259.699-X");
            clientes.setDATA_DE_NASCIMENTO("20/01/2021");
            clientes.setDATA_DE_CADASTRO("20/01/2021");
            clientes.setNACIONALIDADE("Brasileiro");
            clientes.setNATURALIDADE("Ceara");
            clientes.setESTADO_CIVIL("Casado");
            clientes.setCEP("04883-110");
            clientes.setLOGRADOURO("Rua Saverio De Donato");
            clientes.setNUMERO("794");
            clientes.setCOMPLEMENTO("null");
            clientes.setBAIRRO("Jardim Dos Alamos");
            clientes.setCIDADE("São Paulo");
            clientes.setESTADO("UF");
            clientes.setTELEFONE_FIXO("(11)5921-3535");
            clientes.setCELULAR("(11)954.620.941");
            clientes.setEMAIL("aleandrosaldanha@uol.com.br");
            clientes.setEMPRESA("ALS TECNOLOGIA");
            clientes.setCARGO("Direitor");
            clientes.setEND_COMERCIAL("Rua Quintana");
            clientes.setNUM_COMERCIAL("753");
            clientes.setCEP_COMERCIAL("04887-110");
            clientes.setBAIRRO_COMERCIAL("Brooklin");
            clientes.setCIDADE_COMERCIAL("São Paulo");
            clientes.setESTADO_COMERCIAL("SP");
            
            PessoaDao pessoa = new PessoaDao();
            pessoa.adiciona(clientes);
        } else {
            
        }  
    }  
}
