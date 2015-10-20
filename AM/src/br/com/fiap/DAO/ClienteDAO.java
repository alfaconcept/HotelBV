package br.com.fiap.DAO;

import java.sql.Connection;

import br.com.fiap.beans.Cliente;

public class ClienteDAO {
	
	private Connection conexao;
	
	public ClienteDAO() throws Exception {
		this.conexao = new ConexaoFactory().getConnection();
	}

	public void insertCliente(Cliente cliente) throws Exception{
		
		
		
	}
	
}
