package br.com.fiap.conexao;

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
	
	//Conexão com o Banco Oracle
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
//		return DriverManager.getConnection("jdbc:oracle:thin:/:@127.0.0.1:1521:ORCL");
		return DriverManager.getConnection("jdbc:oracle:thin:/:@oracle.fiap.com.br:1521:ORCL","OPS$RM73897","310595");
	}

}
