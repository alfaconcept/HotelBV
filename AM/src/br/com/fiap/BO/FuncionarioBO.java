package br.com.fiap.BO;

import java.sql.Connection;


import br.com.fiap.DAO.FuncionarioDAO;
import br.com.fiap.beans.Funcionario;
import br.com.fiap.excecoes.Excecoes;


/**
* 
* Classe de Regra de negocio da Classe Funcionario.
* @author Elisama Alencar
* @author Leonardo Savoia
* @author Marcus Ferraz
* @author Mauricio Grejanin
* @version 1.0
* @since 1.0
* @see Funcionario
* @see FuncionarioDAO 
* 
*/
public class FuncionarioBO {
	
	/**
	* Metodo que pesquisa uma Funcionario no banco. 
	* 
	* @param  Funcionario funcionario, Connection conn
	* @return objeto do tipo Funcionario.
	* @author Elisama Alencar
	* @author Leonardo Savoia
	* @author Marcus Ferraz
	* @author Mauricio Grejanin
	* @see  Funcionario
	*/
	public Funcionario pesquisarFuncionario(Funcionario funcionario, Connection conn) throws Exception{
		if (funcionario.getCdPessoa() == 0) {
			throw new Excecoes("Por favor, informe o CPF do funcionário para realizar a busca");
		}
		
		 return new FuncionarioDAO().findFuncionario(funcionario, conn);
		
	}	
}
