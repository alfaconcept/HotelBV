package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import br.com.fiap.beans.Reserva;

public class ReservaDAO {
	
	DateFormat df = new SimpleDateFormat("dd/MM/yy");
	
	
	public void insertReserva(Reserva reserva, Connection conn) throws Exception {
		
		String sql = "INSERT INTO T_AM_AFC_RESERVA(CD_RESERVA,CD_CLIENTE,CD_FUNCIONARIO,DT_SOLICITACAO,DT_INICIO_RESERVA,DT_FINAL_RESERVA,QT_ADULTO,QT_CRIANCA,ST_RESERVA)" +
					"VALUES(SQ_AM_AFC_RESERVA.NEXTVAL,?,?,TO_DATE(?, 'dd/mm/yy'),TO_DATE(?, 'dd/mm/yy'),TO_DATE(?, 'dd/mm/yy'),?,?,?)";
		
	 
		PreparedStatement estrutura1 = conn.prepareStatement(sql);
		estrutura1.setInt(1, reserva.getCliente().getCdPessoa() );
		estrutura1.setInt(2, 1);//Segundo o case, não existe funcionario vinculado a Reserva e sim à hospedagem
		estrutura1.setString(3, df.format (reserva.getDtSolicitacao().getTime()));
		estrutura1.setString(4, df.format (reserva.getDtEntrada().getTime()));
		estrutura1.setString(5, df.format (reserva.getDtSaida().getTime()));
		estrutura1.setInt(6, reserva.getQtAdulto());
		estrutura1.setInt(7, reserva.getQtCrianca());
		estrutura1.setBoolean(8, reserva.isStatusReserva());
		
		sql = "INSERT INTO T_AM_AFC_RESERVA_QUARTO(CD_RESERVA,NR_QUARTO,QT_PESSOA_QUARTO,DS_OBSERVACAO)" +
				"VALUES(SQ_AM_AFC_RESERVA.CURRVAL,?,?,?)";
		
		PreparedStatement estrutura2 = conn.prepareStatement(sql);
		estrutura2.setInt(1, reserva.getTipoQuarto().getNrQuarto());
		estrutura2.setInt(2, (reserva.getQtAdulto()+reserva.getQtCrianca())); //Soma de Numero Adultos com Numero Crianças
		estrutura2.setString(3, "teste");
		
		estrutura1.execute();
		estrutura2.execute();
		estrutura1.close();
		estrutura2.close();
	}
	
	

}
