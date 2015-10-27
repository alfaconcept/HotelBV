package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.beans.Funcionario;

public class FuncionarioDAO {
	public Funcionario findFuncionario(Funcionario funcionario, Connection conn) throws Exception{
		
		String sql = "SELECT CD_FUNCIONARIO FROM T_AM_AFC_FUNCIONARIO WHERE CD_FUNCIONARIO = ? AND DS_SENHA = ?";
		
		PreparedStatement estrutura = conn.prepareStatement(sql);
		
		estrutura.setInt(1, funcionario.getCdPessoa());
		estrutura.setString(2, funcionario.getDsSenhaAcesso());
		
		ResultSet resultado = estrutura.executeQuery();
		
		while (resultado.next()) {
			Funcionario func = new Funcionario();
			func.setCdPessoa(resultado.getInt("CD_FUNCIONARIO"));
			resultado.close();
			estrutura.close();
			return func;			
		}
		return null;
	}
}
