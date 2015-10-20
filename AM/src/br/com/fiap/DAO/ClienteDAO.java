package br.com.fiap.DAO;

import java.sql.Connection;

import br.com.fiap.beans.Cliente;
import br.com.fiap.conexao.ConnectionFactory;

public class ClienteDAO {
	

	
	public ClienteDAO() throws Exception {
		
	}

	public void insertCliente(Cliente cliente) throws Exception{
		
		String sql = "INSERT INTO T_AM_AFC_CLIENTE(CD_CLIENTE,NR_CPF,NR_RG,DT_NASCIMENTO,NR_QUARTO_PREFERIDO,DS_EMAIL,DS_SENHA)" + 
				"VALUES(?,?,?,?,?,?,?,?)";
		
		
		
	}
	
}
