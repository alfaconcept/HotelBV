package br.com.fiap.conexao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;

public final class ConnectionFactory {
	
	private static ConnectionFactory conexao = null;
	
	public static ConnectionFactory controlarInstancia(){
		if(conexao == null){
			conexao = new ConnectionFactory();
		}
		return conexao;
	}
	
	
	//Conex�o com o Banco Oracle
	public Connection getConnection() throws Exception {
		FileReader arquivo = new FileReader(System.getProperty("user.dir")+"");
		BufferedReader dados = new BufferedReader(arquivo);
		String url = dados.readLine();
		//String usuario = dados.readLine();
		//String senha = dados.readLine();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		return DriverManager.getConnection(url);
		//return DriverManager.getConnection("jdbc:oracle:thin:/:@192.168.60.15:1521:ORCL");
	}

}
