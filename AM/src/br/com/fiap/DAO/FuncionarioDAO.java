package br.com.fiap.DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.beans.Funcionario;

/**
* 
* Classe CRUD da Classe Funcionario.
* @author Elisama Alencar
* @author Leonardo Savoia
* @author Marcus Ferraz
* @author Mauricio Grejanin
* @version 1.0
* @since 1.0
* @see Funcionario
*  
* 
*/

public class FuncionarioDAO {
	
	/**
	* Metodo que pesquisa uma Funcionario no banco. 
	* 
	* @param  Funcionario funcionario, Connection conn
	* @return objeto do tipo Funcionario.
	* @author Elisama Alencar
	* @author Leonardo Savoia
	* @author Marcus Ferraz
	* @author Mauricio Grejanin
	* @see  Funcionario
	*/
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
