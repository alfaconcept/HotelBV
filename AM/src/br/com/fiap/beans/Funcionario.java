package br.com.fiap.beans;

import java.util.Date;

public class Funcionario extends Pessoa{
	private Date dtAdmissao;
	private String dsCargo;
	private String dsSenhaAcesso;
	
	public Funcionario(int cdPessoa, String nmPessoa, Endereco endereco, Telefone telefone, Date dtAdmissao,
			String dsCargo, String dsSenhaAcesso) {
		super(cdPessoa, nmPessoa, endereco, telefone);
		this.dtAdmissao = dtAdmissao;
		this.dsCargo = dsCargo;
		this.dsSenhaAcesso = dsSenhaAcesso;
	}

	public Funcionario() {
		super();
	}

	public Date getDtAdmissao() {
		return dtAdmissao;
	}

	public void setDtAdmissao(Date dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}

	public String getDsCargo() {
		return dsCargo;
	}

	public void setDsCargo(String dsCargo) {
		this.dsCargo = dsCargo;
	}

	public String getDsSenhaAcesso() {
		return dsSenhaAcesso;
	}

	public void setDsSenhaAcesso(String dsSenhaAcesso) {
		this.dsSenhaAcesso = dsSenhaAcesso;
	}
}
