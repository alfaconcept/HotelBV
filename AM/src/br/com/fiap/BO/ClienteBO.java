package br.com.fiap.BO;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.DAO.ClienteDAO;
import br.com.fiap.beans.Cliente;
import br.com.fiap.excecoes.Excecoes;

public class ClienteBO {
	
	
	
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
