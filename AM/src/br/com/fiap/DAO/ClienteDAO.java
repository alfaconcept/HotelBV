package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import br.com.fiap.beans.Cliente;

public class ClienteDAO {
	
	DateFormat df= new SimpleDateFormat("yyyy-MM-dd");
	
	public ClienteDAO() throws Exception {
		
	}
	
	public Cliente loginCliente(Cliente cliente, Connection conn) throws Exception{
		
		String sql = "SELECT CD_CLIENTE, NM_PESSOA FROM T_AM_AFC_CLIENTE"
				+ " INNER JOIN T_AM_AFC_PESSOA A ON (cd_pessoa = cd_cliente)"
				+ " WHERE DS_EMAIL LIKE ? AND DS_SENHA = ?";
		PreparedStatement estrutura = conn.prepareStatement(sql);
		estrutura.setString(1, cliente.getDsEmail());
		estrutura.setString(2, cliente.getDsSenhaAcesso());
		ResultSet resultado = estrutura.executeQuery();
		while (resultado.next()) {
			Cliente c = new Cliente();
			c.setCdPessoa(resultado.getInt("CD_CLIENTE"));
			c.setNmPessoa(resultado.getString("NM_PESSOA"));
			resultado.close();
			estrutura.close();
			return c;
		}
		
		return null;
	}
	
}