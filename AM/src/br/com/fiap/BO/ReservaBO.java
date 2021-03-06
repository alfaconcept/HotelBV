package br.com.fiap.BO;

import java.sql.Connection;

import br.com.fiap.DAO.ReservaDAO;
import br.com.fiap.beans.Hospedagem;
import br.com.fiap.beans.Reserva;
import br.com.fiap.excecoes.Excecoes;

public class ReservaBO {
	
	
	public Reserva inserirReserva(Reserva reserva, Connection conn) throws Exception{
		
		if (reserva.getCliente() == null) {
			throw new Excecoes("A reserva precisa de um cliente");
		}
		
		if (reserva.getDtSolicitacao() == null) {
			throw new Excecoes("A reserva precisa de uma data de solicita��o");
		}
		
		// Verifica se a data de entrada entrada esta preenchida
		if (reserva.getDtEntrada() == null) {
			throw new Excecoes("A reserva precisa de uma data de entrada");
		}
		
		// Verifica se a data de sa�da esta preenchida
		if (reserva.getDtSaida() == null) {
			throw new Excecoes("A reserva precisa de uma data de sa�da");
		}
		
		// Verifica se a data de entrada � maior que a data de solicita��o
		if ((reserva.getDtEntrada().getTime() - reserva.getDtSolicitacao().getTime()) / (1000*60*60*24) < 0) {
			throw new Excecoes("A data de entrada � menor que a data da reserva");
		}
		
		// Verifica se a data de saida � maior ou igual a data de entrada
		if ((reserva.getDtSaida().getTime() - reserva.getDtEntrada().getTime()) / (1000*60*60*24) < 1) {
			throw new Excecoes("A data de sa�da � menor ou igual a data de entrada");
		}
		
		if (reserva.getQtAdulto() == 0) {
			throw new Excecoes("Reserva deve ter pelo menos um adulto");
		}
		
		if (reserva.getQtQuarto() == 0) {
			throw new Excecoes("Reserva deve ter pelo menos um quarto");
		}
		
		if (reserva.getQuarto() == null) {
			throw new Excecoes("Informar o tipo de quarto");
		}
		
		if (reserva.getVlrReserva() == 0.0){
			throw new Excecoes("Erro no c�lculo do valor da reserva");
		}
		
		
		return new ReservaDAO().insertReserva(reserva, conn);
		
	}
	
	public Reserva findReserva(Hospedagem hospedagem, Connection conn) throws Exception{
		if (hospedagem.getCdHospedagem() == 0) {
			throw new Excecoes("C�digo de hospedagem inv�lido");
		}
		
		return new ReservaDAO().findReserva(hospedagem, conn);
	}
	
}

