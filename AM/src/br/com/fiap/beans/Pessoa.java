package br.com.fiap.beans;

public class Pessoa {
	private int cdPessoa;
	private String nmPessoa;
	private Endereco endereco;
	private Telefone telefone;
	
	public Pessoa(int cdPessoa, String nmPessoa, Endereco endereco,
			Telefone telefone) {
		super();
		this.cdPessoa = cdPessoa;
		this.nmPessoa = nmPessoa;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public Pessoa() {
		super();
	}

	public int getCdPessoa() {
		return cdPessoa;
	}

	public void setCdPessoa(int cdPessoa) {
		this.cdPessoa = cdPessoa;
	}

	public String getNmPessoa() {
		return nmPessoa;
	}

	public void setNmPessoa(String nmPessoa) {
		this.nmPessoa = nmPessoa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
}
