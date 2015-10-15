package br.com.fiap.beans;

import java.util.Date;

public class Funcionario extends Pessoa{
	private Date dataAdmissao;
	private String dsCargo;
	
	public Funcionario(int codPessoa, String nomePessoa, br.com.fiap.beans.Endereco endereco, int cpf, int rg,
			Date dtNascimento, Date dataAdmissao, String dsCargo) {
		super(codPessoa, nomePessoa, endereco, cpf, rg, dtNascimento);
		this.dataAdmissao = dataAdmissao;
		this.dsCargo = dsCargo;
	}

	public Funcionario() {
		super();
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getDsCargo() {
		return dsCargo;
	}

	public void setDsCargo(String dsCargo) {
		this.dsCargo = dsCargo;
	}
	
	
}
