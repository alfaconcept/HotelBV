package br.com.fiap.beans;

import java.util.Date;

public class Funcionario extends Pessoa{
	private Date dtAdmissao;
	private String dsCargo;
	
	public Funcionario(int codPessoa, String nomePessoa, br.com.fiap.beans.Endereco endereco, int cpf, int rg,
			Date dtNascimento, Date dtAdmissao, String dsCargo) {
		super(codPessoa, nomePessoa, endereco, cpf, rg, dtNascimento);
		this.dtAdmissao = dtAdmissao;
		this.dsCargo = dsCargo;
	}

	public Funcionario() {
		super();
	}

	public Date getdtAdmissao() {
		return dtAdmissao;
	}

	public void setdtAdmissao(Date dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}

	public String getDsCargo() {
		return dsCargo;
	}

	public void setDsCargo(String dsCargo) {
		this.dsCargo = dsCargo;
	}
	
	
}
