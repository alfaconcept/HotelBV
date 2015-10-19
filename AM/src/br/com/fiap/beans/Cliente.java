package br.com.fiap.beans;

import java.util.Date;
teste
public class Cliente extends Pessoa{
	private String dsEmail;
	private String dsSenhaAcesso;
	
	public Cliente(int codPessoa, String nomePessoa, br.com.fiap.beans.Endereco endereco, int cpf, int rg,
			Date dtNascimento, String dsEmail, String dsSenhaAcesso) {
		super(codPessoa, nomePessoa, endereco, cpf, rg, dtNascimento);
		this.dsEmail = dsEmail;
		this.dsSenhaAcesso = dsSenhaAcesso;
	}
	
	public Cliente() {
		super();
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
