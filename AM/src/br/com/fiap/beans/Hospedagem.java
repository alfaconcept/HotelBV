package br.com.fiap.beans;

import java.util.Date;

public class Hospedagem {
	private int cdHospedagem;
	private Reserva reserva;
	private Date dtAtual;
	private Date horarioAtual;
	private double vlTotalHospedagem;
	private Consumo consumo;
	
	public Hospedagem(int cdHospedagem, Reserva reserva, Date dtAtual,
			Date horarioAtual, double vlTotalHospedagem, Consumo consumo) {
		super();
		this.cdHospedagem = cdHospedagem;
		this.reserva = reserva;
		this.dtAtual = dtAtual;
		this.horarioAtual = horarioAtual;
		this.vlTotalHospedagem = vlTotalHospedagem;
		this.consumo = consumo;
	}

	public Hospedagem() {
		super();
	}

	public int getCdHospedagem() {
		return cdHospedagem;
	}

	public void setCdHospedagem(int cdHospedagem) {
		this.cdHospedagem = cdHospedagem;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Date getDtAtual() {
		return dtAtual;
	}

	public void setDtAtual(Date dtAtual) {
		this.dtAtual = dtAtual;
	}

	public Date getHorarioAtual() {
		return horarioAtual;
	}

	public void setHorarioAtual(Date horarioAtual) {
		this.horarioAtual = horarioAtual;
	}

	public double getVlTotalHospedagem() {
		return vlTotalHospedagem;
	}

	public void setVlTotalHospedagem(double vlTotalHospedagem) {
		this.vlTotalHospedagem = vlTotalHospedagem;
	}

	public Consumo getConsumo() {
		return consumo;
	}

	public void setConsumo(Consumo consumo) {
		this.consumo = consumo;
	}
	
}
