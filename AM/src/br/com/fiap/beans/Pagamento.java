package br.com.fiap.beans;

import java.util.Date;

public class Pagamento {
	private Hospedagem hospedagem;
	private Date dtSaida;
	private Date horarioSaida;
	private Funcionario funcionario;
	
	public Pagamento(Hospedagem hospedagem, Date dtSaida, Date horarioSaida,
			Funcionario funcionario) {
		super();
		this.hospedagem = hospedagem;
		this.dtSaida = dtSaida;
		this.horarioSaida = horarioSaida;
		this.funcionario = funcionario;
	}

	public Pagamento() {
		super();
	}

	public Hospedagem getHospedagem() {
		return hospedagem;
	}

	public void setHospedagem(Hospedagem hospedagem) {
		this.hospedagem = hospedagem;
	}

	public Date getDtSaida() {
		return dtSaida;
	}

	public void setDtSaida(Date dtSaida) {
		this.dtSaida = dtSaida;
	}

	public Date getHorarioSaida() {
		return horarioSaida;
	}

	public void setHorarioSaida(Date horarioSaida) {
		this.horarioSaida = horarioSaida;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
}