package br.com.fiap.beans;

import java.util.Date;

public class Reserva {
	private int cdReserva;
	private Date dtSolicitacao;
	private Date dtEntrada;
	private Date dtSaida;
	private int qtAdulto;
	private int qtCrianca;
	private Quarto tipoQuarto;
	private int qtQuarto;
	private boolean statusReserva;
	private double vlrReserva;
	private Cliente cliente;
	
	public Reserva(int cdReserva, Date dtSolicitacao, Date dtEntrada,
			Date dtSaida, int qtAdulto, int qtCrianca, Quarto tipoQuarto,
			int qtQuarto, boolean statusReserva, double vlrReserva,
			Cliente cliente) {
		super();
		this.cdReserva = cdReserva;
		this.dtSolicitacao = dtSolicitacao;
		this.dtEntrada = dtEntrada;
		this.dtSaida = dtSaida;
		this.qtAdulto = qtAdulto;
		this.qtCrianca = qtCrianca;
		this.tipoQuarto = tipoQuarto;
		this.qtQuarto = qtQuarto;
		this.statusReserva = statusReserva;
		this.vlrReserva = vlrReserva;
		this.cliente = cliente;
	}

	public Reserva() {
		super();
	}

	public int getCdReserva() {
		return cdReserva;
	}

	public void setCdReserva(int cdReserva) {
		this.cdReserva = cdReserva;
	}

	public Date getDtSolicitacao() {
		return dtSolicitacao;
	}

	public void setDtSolicitacao(Date dtSolicitacao) {
		this.dtSolicitacao = dtSolicitacao;
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

	public int getQtAdulto() {
		return qtAdulto;
	}

	public void setQtAdulto(int qtAdulto) {
		this.qtAdulto = qtAdulto;
	}

	public int getQtCrianca() {
		return qtCrianca;
	}

	public void setQtCrianca(int qtCrianca) {
		this.qtCrianca = qtCrianca;
	}

	public Quarto getTipoQuarto() {
		return tipoQuarto;
	}

	public void setTipoQuarto(Quarto tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}

	public int getQtQuarto() {
		return qtQuarto;
	}

	public void setQtQuarto(int qtQuarto) {
		this.qtQuarto = qtQuarto;
	}

	public boolean isStatusReserva() {
		return statusReserva;
	}

	public void setStatusReserva(boolean statusReserva) {
		this.statusReserva = statusReserva;
	}

	public double getVlrReserva() {
		return vlrReserva;
	}

	public void setVlrReserva(double vlrReserva) {
		// Obtem o valor do tipo de quarto
		double VlTipoQuarto = this.tipoQuarto.getTipoQuarto().getVlTipoQuarto();
		// Multiplica o valor do tipo de quarto pela quantidade de quartos
		this.vlrReserva = (VlTipoQuarto * qtQuarto);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
		
}
