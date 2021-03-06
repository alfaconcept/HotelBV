package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import br.com.fiap.beans.Hospedagem;
import br.com.fiap.beans.Quarto;
import br.com.fiap.beans.Reserva;

public class ReservaDAO {
	
	DateFormat df = new SimpleDateFormat("dd/MM/yy");
	
	
	public Reserva insertReserva(Reserva reserva, Connection conn) throws Exception {
		
				
		String sql = "INSERT INTO T_AM_AFC_RESERVA(CD_RESERVA,CD_CLIENTE,CD_FUNCIONARIO,DT_SOLICITACAO,DT_INICIO_RESERVA,DT_FINAL_RESERVA,QT_ADULTO,QT_CRIANCA,ST_RESERVA)" +
					"VALUES(SQ_AM_AFC_RESERVA.NEXTVAL,?,?,TO_DATE(?, 'dd/mm/yy'),TO_DATE(?, 'dd/mm/yy'),TO_DATE(?, 'dd/mm/yy'),?,?,?)";
		
	 
		PreparedStatement estrutura1 = conn.prepareStatement(sql);
		estrutura1.setInt(1, reserva.getCliente().getCdPessoa() );
		estrutura1.setInt(2, 1);//Segundo o case, n�o existe funcionario vinculado a Reserva e sim � hospedagem
		estrutura1.setString(3, df.format (reserva.getDtSolicitacao().getTime()));
		estrutura1.setString(4, df.format (reserva.getDtEntrada().getTime()));
		estrutura1.setString(5, df.format (reserva.getDtSaida().getTime()));
		estrutura1.setInt(6, reserva.getQtAdulto());
		estrutura1.setInt(7, reserva.getQtCrianca());
		estrutura1.setBoolean(8, reserva.isStatusReserva());
		
		sql = "INSERT INTO T_AM_AFC_RESERVA_QUARTO(CD_RESERVA,NR_QUARTO,QT_PESSOA_QUARTO,DS_OBSERVACAO)" +
				"VALUES(SQ_AM_AFC_RESERVA.CURRVAL,?,?,?)";
		
		PreparedStatement estrutura2 = conn.prepareStatement(sql);
		estrutura2.setInt(1, reserva.getQuarto().getNrQuarto());
		estrutura2.setInt(2, (reserva.getQtAdulto()+reserva.getQtCrianca())); //Soma de Numero Adultos com Numero Crian�as
		estrutura2.setString(3, reserva.getDsObservacao());
		
		estrutura1.execute();
		estrutura2.execute();
		
		sql = "SELECT SQ_AM_AFC_RESERVA.currval FROM DUAL";
		PreparedStatement estrutura3 = conn.prepareStatement(sql);
		ResultSet resultado = estrutura3.executeQuery();
		
		while (resultado.next()) {
			reserva.setCdReserva(resultado.getInt("CURRVAL"));	
			estrutura1.close();
			estrutura2.close();
			estrutura3.close();
			return reserva;			
		}	
		
		return null;
		
	}
	
	public Reserva findReserva(Hospedagem hospedagem, Connection conn) throws Exception{
		
		String sql = "SELECT "
				+ "A.CD_RESERVA,  "
				+ "A.DT_INICIO_RESERVA, "
				+ "A.DT_FINAL_RESERVA, "
				+ "A.QT_ADULTO, "
				+ "A.QT_CRIANCA,"
				+ "B.NR_QUARTO,"
				+ "B.QT_PESSOA_QUARTO,"
				+ "FROM"
				+ "	T_AM_AFC_RESERVA A"
				+ "INNER JOIN"
				+ "	T_AM_AFC_RESERVA_QUARTO B"
				+ "WHERE A.CD_RESERVA = ? ";
		
		PreparedStatement estrutura = conn.prepareStatement(sql);
		estrutura.setInt(1, hospedagem.getReserva().getCdReserva());
		ResultSet resultado = estrutura.executeQuery();
		
		while(resultado.next()){
			Reserva reserva = new Reserva();
			Quarto quarto = new Quarto();
			
			
			quarto.setNrQuarto(resultado.getInt("NR_QUARTO"));
			reserva.setCdReserva(resultado.getInt("CD_RESERVA"));
			reserva.setDtEntrada((Date) resultado.getDate("DT_INICIO_RESERVA"));
			reserva.setDtSaida((Date) resultado.getDate("DT_FIM_RESERVA"));
			reserva.setQtAdulto(resultado.getInt("QT_ADULTO"));
			reserva.setQtCrianca(resultado.getInt("QT_CRIANCA"));
			reserva.setQuarto(quarto);
			
			return reserva;
		}
		
		return null;
	}
	
	

}

