package br.com.fiap.BO;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.DAO.ClienteDAO;
import br.com.fiap.beans.Cliente;
import br.com.fiap.excecoes.Excecoes;

public class ClienteBO {
	
	public void inserirCliente(Cliente cliente) throws Excecoes{
		if (cliente.getNmPessoa().equals("")) {
			throw new Excecoes("Por favor, informe o seu nome");
		}
		
		if (cliente.getEndereco().getCep().equals("")) {
			throw new Excecoes("Por favor, informe o seu CEP");
		}
		
//		if (cliente.getEndereco().getRua().equals("")) {
//			throw new Excecoes("Por favor, informe sua rua");
//		}
		
		if (cliente.getEndereco().getNumero() == 0) {
			throw new Excecoes("Por favor, informe o numero de seu endereço");
		}
		
		if (cliente.getEndereco().getBairro().equals("")) {
			throw new Excecoes("Por favor, informe o seu bairro");
		}
		
		if (cliente.getEndereco().getCidade().equals("")) {
			throw new Excecoes("Por favor, informe a sua cidade");
		}
		
		if (cliente.getEndereco().getEstado().equals("")) {
			throw new Excecoes("Por favor, informe o seu estado");
		}
		
		if (cliente.getCpf() == 0) {
			throw new Excecoes("Por favor, informe o seu CPF");
		}
		
//		if (cliente.getRg() == 0) {
//			throw new Excecoes("Por favor, informe o seu RG");
//		}
		
		if (cliente.getDtNascimento() == null) {
			throw new Excecoes("Por favor, informe sua data de nascimento");
		}
		
		// new ClienteDAO().insertCliente(cliente);
	}
	
	public Cliente pesquisarCliente(int nrIdentificador, Connection conn) throws Exception{
		if (nrIdentificador == 0) {
			throw new Excecoes("Por favor, informe o CPF do cliente para realizar a busca");
		}
		
		return new ClienteDAO().findCliente(nrIdentificador, conn);
		
	}
	
	public List<Cliente> listarClientes() throws Exception{
		// return new clienteDAO().selectAllCliente();
		return null; // REMOVER ESTA LINHA APÓS CRIAR OS MÉTODOS DAO
	}
	
	public void atualizarCliente(Cliente cliente)  throws Exception{
//		if (cliente.getcdPessoa() == 0) {
//			throw new Excecoes("Por favor, informe o código do cliente");
//		}
		
//		if (cliente.getnmPessoa().equals("")) {
//			throw new Excecoes("Por favor, informe o seu nome");
//		}
		
		if (cliente.getEndereco().getCep().equals("")) {
			throw new Excecoes("Por favor, informe o seu CEP");
		}
		
//		if (cliente.getEndereco().getRua().equals("")) {
//			throw new Excecoes("Por favor, informe sua rua");
//		}
		
		if (cliente.getEndereco().getNumero() == 0) {
			throw new Excecoes("Por favor, informe o numero de seu endereço");
		}
		
		if (cliente.getEndereco().getBairro().equals("")) {
			throw new Excecoes("Por favor, informe o seu bairro");
		}
		
		if (cliente.getEndereco().getCidade().equals("")) {
			throw new Excecoes("Por favor, informe a sua cidade");
		}
		
		if (cliente.getEndereco().getEstado().equals("")) {
			throw new Excecoes("Por favor, informe o seu estado");
		}
		
		if (cliente.getCpf() == 0) {
			throw new Excecoes("Por favor, informe o seu CPF");
		}
		
//		if (cliente.getRg() == 0) {
//			throw new Excecoes("Por favor, informe o seu RG");
//		}
		
		if (cliente.getDtNascimento() == null) {
			throw new Excecoes("Por favor, informe sua data de nascimento");
		}
		
		// new ClienteDAO().updateCliente(cliente);
	}
	
	public void deletarCliente(int nrIdentificador) throws Exception{
		if (nrIdentificador == 0) {
			throw new Excecoes("Por favor, informe o código do cliente");
		}
		
		// new ClienteDAO().deleteCliente(nrIdentificador);
	}
	
	public Cliente loginCliente(Cliente cliente, Connection conn) throws Exception{
		if (cliente.getDsEmail().equals("")) {
			throw new Excecoes("Por favor, informe seu email para realizar login");
		}
		
		if (cliente.getDsSenhaAcesso().equals("")) {
			throw new Excecoes("Por favor, informe sua senha para realizar login");
		}
		
		return new ClienteDAO().loginCliente(cliente, conn);
	}
}
