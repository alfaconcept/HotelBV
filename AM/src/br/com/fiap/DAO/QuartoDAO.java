package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.beans.Quarto;
import br.com.fiap.beans.TipoQuarto;

public class QuartoDAO {
	
public Quarto findQuarto(String nmQuarto, Connection conn) throws Exception{
		
		String sql = "SELECT B.NR_QUARTO, B.NR_ANDAR, A.DS_TIPO_QUARTO, D.VL_PRECO_QUARTO FROM T_AM_AFC_QUARTO B" 
				 + " INNER JOIN T_AM_AFC_TIPO_QUARTO A ON (A.CD_TIPO_QUARTO = B.CD_TIPO_QUARTO)"
				 + " INNER JOIN T_AM_AFC_HIST_VALOR D ON (A.CD_TIPO_QUARTO = D.CD_TIPO_QUARTO)"
				 + " WHERE A.DS_TIPO_QUARTO LIKE 'LUXO' AND ROWNUM < 2 AND DS_STATUS LIKE 'LIVRE'";
		
		PreparedStatement estrutura = conn.prepareStatement(sql);
		estrutura.setString(1, nmQuarto);
		ResultSet resultado = estrutura.executeQuery();
		while (resultado.next()) {
			Quarto quarto = new Quarto();
			TipoQuarto tipoQuarto = new TipoQuarto();
			quarto.setCdQuarto(resultado.getInt("NR_QUARTO"));
			quarto.setNrAndar(resultado.getInt("NR_ANDAR"));
			tipoQuarto.setDsTipoQuarto(resultado.getString("DS_TIPO_QUARTO"));
			tipoQuarto.setVlTipoQuarto(resultado.getDouble("VL_PRECO_QUARTO"));
			quarto.setTipoQuarto(tipoQuarto);
			resultado.close();
			return quarto;
		}
		
		return null;
	}
}
