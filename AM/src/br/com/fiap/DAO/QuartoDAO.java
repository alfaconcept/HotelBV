package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.beans.Quarto;
import br.com.fiap.beans.TipoQuarto;

public class QuartoDAO {
	
public Quarto findQuarto(Quarto quarto, Connection conn) throws Exception{
		
		String sql = "SELECT NR_QUARTO, NR_ANDAR FROM T_AM_AFC_QUARTO"
				 + " WHERE CD_TIPO_QUARTO = ? AND ROWNUM < 2 AND DS_STATUS LIKE 'LIVRE'";
		
		PreparedStatement estrutura = conn.prepareStatement(sql);
		estrutura.setInt(1, quarto.getTipoQuarto().getCodTipoQuarto());
		ResultSet resultado = estrutura.executeQuery();
		while (resultado.next()) {
			quarto.setNrQuarto(resultado.getInt("NR_QUARTO"));
			quarto.setNrAndar(resultado.getInt("NR_ANDAR"));
			resultado.close();
			return quarto;
		}
		return null;
	}
}
