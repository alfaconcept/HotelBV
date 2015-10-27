package br.com.fiap.beans;

import java.util.Date;
import java.util.List;

public class Hospedagem {
	private int cdHospedagem;
	private Reserva reserva;
	private Date dtEntrada;
	private Date dtSaida;
	private Date dtAtual;
	private Date horarioAtual;
	private double vlTotalHospedagem;
	private List <Consumo> consumo;
	private Funcionario funcionario;
	
	public Hospedagem(int cdHospedagem, Reserva reserva, Date dtEntrada, Date dtSaida, Date dtAtual, Date horarioAtual,
			double vlTotalHospedagem, List<Consumo> consumo, Funcionario funcionario) {
		super();
		this.cdHospedagem = cdHospedagem;
		this.reserva = reserva;
		this.dtEntrada = dtEntrada;
		this.dtSaida = dtSaida;
		this.dtAtual = dtAtual;
		this.horarioAtual = horarioAtual;
		this.vlTotalHospedagem = vlTotalHospedagem;
		this.consumo = consumo;
		this.funcionario = funcionario;
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

	public Date getDtEntrada() {
		return dtEntrada;
	}

	public void setDtEntrada(Date dtEntrada) {
		this.dtEntrada = dtEntrada;
	}

	public Date getDtSaida() {
		return dtSaida;
	}

	public void setDtSaida(Date dtSaida) {
		this.dtSaida = dtSaida;
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

	public List<Consumo> getConsumo() {
		return consumo;
	}

	public void setConsumo(List<Consumo> consumo) {
		this.consumo = consumo;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
}
