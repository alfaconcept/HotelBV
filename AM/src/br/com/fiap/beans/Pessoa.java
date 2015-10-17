package br.com.fiap.beans;

import java.util.Date;

public class Pessoa {
	private int cdPessoa;
	private String nmPessoa;
	private Endereco endereco;
	private int cpf;
	private int rg;
	private Date dtNascimento ;
	
	public Pessoa(int cdPessoa, String nmPessoa, br.com.fiap.beans.Endereco endereco, int cpf, int rg,
			Date dtNascimento) {
		super();
		this.cdPessoa = cdPessoa;
		this.nmPessoa = nmPessoa;
		this.endereco = endereco;
		this.cpf = cpf;
		this.rg = rg;
		this.dtNascimento = dtNascimento;
	}

	public Pessoa() {
		super();
	}

	public int getcdPessoa() {
		return cdPessoa;
	}

	public void setcdPessoa(int cdPessoa) {
		this.cdPessoa = cdPessoa;
	}

	public String getnmPessoa() {
		return nmPessoa;
	}

	public void setnmPessoa(String nmPessoa) {
		this.nmPessoa = nmPessoa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
}
