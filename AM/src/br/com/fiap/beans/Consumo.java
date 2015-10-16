package br.com.fiap.beans;

import java.util.Date;

public class Consumo {
	private int cdConsumo;
	private ProdutoServico tipoServico;
	private Funcionario funcionario;
	private Date dtConsumo;
	private int qtConsumo;
	private double vlServicoTotal;
	
	public Consumo(int cdConsumo, ProdutoServico tipoServico,
			Funcionario funcionario, Date dtConsumo, int qtConsumo,
			double vlServicoTotal) {
		super();
		this.cdConsumo = cdConsumo;
		this.tipoServico = tipoServico;
		this.funcionario = funcionario;
		this.dtConsumo = dtConsumo;
		this.qtConsumo = qtConsumo;
		this.vlServicoTotal = vlServicoTotal;
	}

	public Consumo() {
		super();
	}

	public int getCdConsumo() {
		return cdConsumo;
	}

	public void setCdConsumo(int cdConsumo) {
		this.cdConsumo = cdConsumo;
	}

	public ProdutoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(ProdutoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Date getDtConsumo() {
		return dtConsumo;
	}

	public void setDtConsumo(Date dtConsumo) {
		this.dtConsumo = dtConsumo;
	}

	public int getQtConsumo() {
		return qtConsumo;
	}

	public void setQtConsumo(int qtConsumo) {
		this.qtConsumo = qtConsumo;
	}

	public double getVlServicoTotal() {
		return vlServicoTotal;
	}

	public void setVlServicoTotal(double vlServicoTotal) {
		this.vlServicoTotal = vlServicoTotal * this.qtConsumo;
	}
	
}
