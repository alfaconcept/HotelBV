package br.com.fiap.BO;

import java.sql.Connection;

import br.com.fiap.DAO.FuncionarioDAO;
import br.com.fiap.beans.Funcionario;
import br.com.fiap.excecoes.Excecoes;

public class FuncionarioBO {
	
	public Funcionario pesquisarFuncionario(Funcionario funcionario, Connection conn) throws Exception{
		if (funcionario.getCdPessoa() == 0) {
			throw new Excecoes("Por favor, informe o CPF do funcionário para realizar a busca");
		}
		
		 return new FuncionarioDAO().findFuncionario(funcionario, conn);
		
	}	
}
