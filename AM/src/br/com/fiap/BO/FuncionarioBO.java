package br.com.fiap.BO;

import java.util.List;

import br.com.fiap.beans.Funcionario;
import br.com.fiap.excecoes.Excecoes;

public class FuncionarioBO {
	public void inserirFuncionario(Funcionario funcionario) throws Excecoes{
		if (funcionario.getnmPessoa().equals("")) {
			throw new Excecoes("Por favor, informe o nome do funcion�rio");
		}
		
		if (funcionario.getEndereco().getCep() == 0) {
			throw new Excecoes("Por favor, informe o CEP do funcion�rio");
		}
		
		if (funcionario.getEndereco().getRua().equals("")) {
			throw new Excecoes("Por favor, informe a rua do funcion�rio");
		}
		
		if (funcionario.getEndereco().getNumero() == 0) {
			throw new Excecoes("Por favor, informe o numero do endere�o do funcion�rio");
		}
		
		if (funcionario.getEndereco().getBairro().equals("")) {
			throw new Excecoes("Por favor, informe o bairro do funcion�rio");
		}
		
		if (funcionario.getEndereco().getCidade().equals("")) {
			throw new Excecoes("Por favor, informe a cidade do funcion�rio");
		}
		
		if (funcionario.getEndereco().getEstado().equals("")) {
			throw new Excecoes("Por favor, informe o estado do funcion�rio");
		}
		
		if (funcionario.getCpf() == 0) {
			throw new Excecoes("Por favor, informe o CPF do funcion�rio");
		}
		
		if (funcionario.getRg() == 0) {
			throw new Excecoes("Por favor, informe o RG do funcion�rio");
		}
		
		if (funcionario.getDtNascimento() == null) {
			throw new Excecoes("Por favor, informe a data de nascimento do funcion�rio");
		}
		
		// new FuncionarioDAO().insertFuncionario(funcionario);
	}	

	public Funcionario pesquisarFuncionario(int cpf) throws Exception{
		if (cpf == 0) {
			throw new Excecoes("Por favor, informe o CPF do funcion�rio para realizar a busca");
		}
		
		// return new FuncionarioDAO().findFuncionario(cpf);
		
		return null; // REMOVER ESTA LINHA AP�S CRIAR OS M�TODOS DAO
	}
	
	public List<Funcionario> listarFuncionario() throws Exception{
		// return new FuncionarioDAO().selectAllFuncionario();
		return null; // REMOVER ESTA LINHA AP�S CRIAR OS M�TODOS DAO
	}
	
	public void atualizarFuncionario(Funcionario funcionario)  throws Exception{
		if (funcionario.getcdPessoa() == 0) {
			throw new Excecoes("Por favor, informe o c�digo do funcion�rio");
		}
		
		if (funcionario.getnmPessoa().equals("")) {
			throw new Excecoes("Por favor, informe o nome do funcion�rio");
		}
		
		if (funcionario.getEndereco().getCep() == 0) {
			throw new Excecoes("Por favor, informe o CEP do funcion�rio");
		}
		
		if (funcionario.getEndereco().getRua().equals("")) {
			throw new Excecoes("Por favor, informe a rua do funcion�rio");
		}
		
		if (funcionario.getEndereco().getNumero() == 0) {
			throw new Excecoes("Por favor, informe o numero do endere�o do funcion�rio");
		}
		
		if (funcionario.getEndereco().getBairro().equals("")) {
			throw new Excecoes("Por favor, informe o bairro do funcion�rio");
		}
		
		if (funcionario.getEndereco().getCidade().equals("")) {
			throw new Excecoes("Por favor, informe a cidade do funcion�rio");
		}
		
		if (funcionario.getEndereco().getEstado().equals("")) {
			throw new Excecoes("Por favor, informe o estado do funcion�rio");
		}
		
		if (funcionario.getCpf() == 0) {
			throw new Excecoes("Por favor, informe o CPF do funcion�rio");
		}
		
		if (funcionario.getRg() == 0) {
			throw new Excecoes("Por favor, informe o RG do funcion�rio");
		}
		
		if (funcionario.getDtNascimento() == null) {
			throw new Excecoes("Por favor, informe a data de nascimento do funcion�rio");
		}
		
		// new FuncionarioDAO().updateFuncionario(funcionario);
	}
	
	public void deletarFuncioario(int codFuncionario) throws Exception{
		if (codFuncionario == 0) {
			throw new Excecoes("Por favor, informe o c�digo do funcion�rio");
		}
	}
	
}
