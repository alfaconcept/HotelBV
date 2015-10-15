package br.com.fiap.beans;

import java.util.Date;

public class Pessoa {
	private int codPessoa;
	private String nomePessoa;
	private Endereco Endereco;
	private int cpf;
	private int rg;
	private Date dtNascimento ;
	
	public Pessoa(int codPessoa, String nomePessoa, br.com.fiap.beans.Endereco endereco, int cpf, int rg,
			Date dtNascimento) {
		super();
		this.codPessoa = codPessoa;
		this.nomePessoa = nomePessoa;
		Endereco = endereco;
		this.cpf = cpf;
		this.rg = rg;
		this.dtNascimento = dtNascimento;
	}

	public Pessoa() {
		super();
	}

	public int getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(int codPessoa) {
		this.codPessoa = codPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public Endereco getEndereco() {
		return Endereco;
	}

	public void setEndereco(Endereco endereco) {
		Endereco = endereco;
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
