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
		
		/*
		File arquivosImagens = new File(request.getRealPath("/Conexao"));
		FileReader arquivo = new FileReader("/conexao/banco.txt");
		BufferedReader dados = new BufferedReader(arquivo);
		String url = dados.readLine();
		String usuario = dados.readLine();
		String senha = dados.readLine();		
		*/
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//return DriverManager.getConnection("jdbc:oracle:thin:/:@192.168.60.15:1521:ORCL");
		return DriverManager.getConnection("jdbc:oracle:thin:/:@oracle.fiap.com:1521:ORCL","OPS$RM74737","090787");
		//return DriverManager.getConnection(url, usuario, senha);
	}

}
