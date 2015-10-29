package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.beans.Hospedagem;
import br.com.fiap.beans.TipoQuarto;

/**
* 
* Classe CRUD da Classe TipoQuarto
* @author Elisama Alencar
* @author Leonardo Savoia
* @author Marcus Ferraz
* @author Mauricio Grejanin
* @version 1.0
* @since 1.0
* @see TipoQuarto
*  
* 
*/
public class TipoQuartoDAO {
	
	/**
	* Metodo que pesquisa um TipoQuarto no banco. 
	* 
	* @param  TipoQuarto tipoQuarto, Connection conn 
	* @return   objeto do tipo TipoQuarto.
	* @author Elisama Alencar
	* @author Leonardo Savoia
	* @author Marcus Ferraz
	* @author Mauricio Grejanin
	* @see  TipoQuarto
	*/
	public TipoQuarto findTipoQuarto(TipoQuarto tipoQuarto, Connection conn) throws Exception{
		String sql = "SELECT T.CD_TIPO_QUARTO, T.DS_TIPO_QUARTO, D.VL_PRECO_QUARTO FROM T_AM_AFC_TIPO_QUARTO T"
				+ " INNER JOIN T_AM_AFC_HIST_VALOR D ON (T.CD_TIPO_QUARTO = D.CD_TIPO_QUARTO)"
				+ " WHERE T.DS_TIPO_QUARTO LIKE ? AND ROWNUM < 2";
				
		PreparedStatement estrutura = conn.prepareStatement(sql);
		estrutura.setString(1, tipoQuarto.getDsTipoQuarto().toUpperCase());
		ResultSet resultado = estrutura.executeQuery();
		
		
		
		while (resultado.next()) {
			tipoQuarto.setCodTipoQuarto(resultado.getInt("CD_TIPO_QUARTO"));
			tipoQuarto.setDsTipoQuarto(resultado.getString("DS_TIPO_QUARTO"));
			tipoQuarto.setVlTipoQuarto(resultado.getDouble("VL_PRECO_QUARTO"));
			resultado.close();
			estrutura.close();
			return tipoQuarto;		
		}		
		return null;
	}
	
}
