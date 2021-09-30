package Teste;

import Dao.PessoaDao;
import Modelo.*;
import java.sql.SQLException;
import Factory.*;

public class Testes {

	public static void main(String[] args) throws SQLException {

		/*Pessoa pessoa = new Pessoa();
		pessoa.setCPF("510.427.083-07");
		pessoa.setNOME("Antonio Saldanha");
		pessoa.setRG("24.259.699-X");
		pessoa.setDATA_DE_NASCIMENTO("19/05/1976");
		pessoa.setNOME("Antonio Leandro Saldanha");
		pessoa.setRG("24.259.699-0");
		pessoa.setDATA_DE_NASCIMENTO("19/05/1975");
		pessoa.setDATA_DE_CADASTRO("25/01/2021");
		pessoa.setNACIONALIDADE("Brasileiro");
		pessoa.setNATURALIDADE("Ceará");
		pessoa.setESTADO_CIVIL("Solteiro");
		pessoa.setCEP("04883-112");
		pessoa.setLOGRADOURO("Rua Miniades");
		pessoa.setNUMERO("790");
		pessoa.setCOMPLEMENTO(" ");
		pessoa.setBAIRRO("Jardim Aladim");
		pessoa.setCIDADE("São Paulo");
		pessoa.setESTADO("SP");
		pessoa.setTELEFONE_FIXO("(11)5921-3637");
		pessoa.setCELULAR("(11)954.620.951");
		pessoa.setEMAIL("aleandrosaldanha@bol.com.br");
		pessoa.setEMPRESA("ALS TECNOLOGIA");
		pessoa.setCARGO("Gerente");
		pessoa.setEND_COMERCIAL("Rua Das Barcaças");
		pessoa.setNUM_END_COM("703");
		pessoa.setCEP_END_COM("04885-110");
		pessoa.setBAIRRO_END_COM("Brooklin");
		pessoa.setCIDADE_END_COM("São Paulo");
		pessoa.setESTADO_END_COM("SP");
		pessoa.setTIPO_PESSOA("C");
                pessoa.setLOGIN("Antonio");
                pessoa.setSENHA("1234");

		PessoaDao pessoadao = new PessoaDao();
		try {
		    if (pessoadao.busca(pessoa)) {
		        System.out.println("Já existe um cadastro para este CPF!");
	            } else {
			    pessoadao.adiciona(pessoa);
			    System.out.println("Registro salvo com sucesso! ");
		    }
		} catch (SQLException ex) {
			System.out.println("Não foi possível salvar o cadastro..." + ex.getMessage());
		}*/
                
                /*try {
		    if (pessoadao.busca(pessoa)) {
		        pessoadao.deleta(pessoa);
                        System.out.println("Registro excluído com sucesso!");
	            } else {
			    //pessoadao.adiciona(pessoa);
			    System.out.println("Não há registro com esta descrição na base! ");
		    }
		} catch (SQLException ex) {
			System.out.println("Não foi possível executar a ação! " + ex.getMessage());
			ex.printStackTrace();
		}*/
                
                /*try {
		    if (pessoadao.busca(pessoa)) {
		        pessoadao.atualiza(pessoa);
                        System.out.println("Registro atualizado com sucesso!");
	            } else {
			    pessoadao.adiciona(pessoa);
			    System.out.println("Não há registro com esta descrição na base! ");
		    }
		} catch (SQLException ex) {
			System.out.println("Não foi possível atualizar o cadastro..." + ex.getMessage());
		}*/
                
                /*try {
		     pessoadao.atualiza(pessoa);
		     System.out.println("Registro atualizado com sucesso!");   
		} catch (SQLException ex) {
			System.out.println("Não foi possível atualizar o cadastro..." + ex.getMessage());
		}*/
                
                //pessoadao.listar();
                
                ConnectionFactory connection = new ConnectionFactory();
                connection.getConnection();
	}
        
}
