package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.beans.Pagamento;
import br.com.fiap.beans.Quarto;
import br.com.fiap.beans.Reserva;

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

public void updateStatusQuarto(Reserva reserva, Connection conn ) throws Exception{
	
		String sql = "UPDATE T_AM_AFC_QUARTO SET DS_STATUS = ?" 
				+ " WHERE NR_QUARTO IN ( "
		         		+ "SELECT D.NR_QUARTO"
		         		+ " FROM " 
		         		+ " T_AM_AFC_RESERVA A" 
		                + " INNER JOIN " 
		                + " T_AM_AFC_RESERVA_QUARTO C ON (A.CD_RESERVA = C.CD_RESERVA)" 
		                + "INNER JOIN" 
		                + " T_AM_AFC_QUARTO D ON (C.NR_QUARTO = D.NR_QUARTO)"
		                +" WHERE" 
		                +" A.CD_RESERVA = ?" 
		                + ")";
		
		PreparedStatement estrutura = conn.prepareStatement(sql);
		estrutura.setString(1, reserva.getQuarto().getStatus().toUpperCase());
		estrutura.setInt(2,reserva.getCdReserva());
		System.out.println(reserva.getCdReserva());
		System.out.println(reserva.getQuarto().getNrQuarto());
		estrutura.execute();
	
	}

public void updateStatusQuarto(Pagamento pagamento, Connection conn ) throws Exception{
	
	String sql = "UPDATE T_AM_AFC_QUARTO SET DS_STATUS = 'LIVRE' "
			+ "WHERE NR_QUARTO IN ( "
			+ "                SELECT "
			+ "                   D.NR_QUARTO "
			+ "                  FROM "
			+ "                    T_AM_AFC_PAGAMENTO A "
			+ "                  INNER JOIN "
			+ "                    T_AM_AFC_HOSPEDAGEM B ON (A.CD_HOSPEDAGEM = B.CD_HOSPEDAGEM)"
			+ "                  INNER JOIN "
			+ "                    T_AM_AFC_RESERVA_QUARTO C ON (B.CD_RESERVA = C.CD_RESERVA) "
			+ "                  INNER JOIN "
			+ "                    T_AM_AFC_QUARTO D ON (C.NR_QUARTO = D.NR_QUARTO) "
			+ "                  INNER JOIN "
			+ "                    T_AM_AFC_TIPO_QUARTO E ON (D.CD_TIPO_QUARTO = E.CD_TIPO_QUARTO) "
			+ "                  INNER JOIN "
			+ "                    T_AM_AFC_TIPO_FORMAPAG F ON (A.CD_TIPO_FORMAPAG = F.CD_TIPO_FORMAPAG) "
			+ "                  WHERE "
			+ "                    A.CD_RESERVA = ? "
			+ "                  )";
	
	PreparedStatement estrutura = conn.prepareStatement(sql);
	estrutura.setInt(1, pagamento.getHospedagem().getReserva().getQuarto().getNrQuarto());
	estrutura.execute();
	
}

}

