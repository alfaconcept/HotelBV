package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	//Conexão com o Banco Oracle
	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:/:@192.168.60.15:1521:ORCL");
	}

}
