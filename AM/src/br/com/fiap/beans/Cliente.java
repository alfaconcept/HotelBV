package br.com.fiap.beans;

import java.util.Date;

public class Cliente extends Pessoa{
	private int cpf;
	private String rg;
	private Date dtNascimento;
	private String dsEmail;
	private String dsSenhaAcesso;
		
	public Cliente(int cdPessoa, String nmPessoa, Endereco endereco,
			Telefone telefone, int cpf, String rg, Date dtNascimento,
			String dsEmail, String dsSenhaAcesso) {
		super(cdPessoa, nmPessoa, endereco, telefone);
		this.cpf = cpf;
		this.rg = rg;
		this.dtNascimento = dtNascimento;
		this.dsEmail = dsEmail;
		this.dsSenhaAcesso = dsSenhaAcesso;
	}

	public Cliente() {
		super();
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getDsEmail() {
		return dsEmail;
	}

	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}

	public String getDsSenhaAcesso() {
		return dsSenhaAcesso;
	}

	public void setDsSenhaAcesso(String dsSenhaAcesso) {
		this.dsSenhaAcesso = dsSenhaAcesso;
	}
}
