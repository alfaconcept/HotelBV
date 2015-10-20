package br.com.fiap.beans;

public class Telefone {
	private short ddd;
	private int telefone;
	private String tipoFone;
	private int ramal;
	
	public Telefone(short ddd, int telefone, String tipoFone, int ramal) {
		super();
		this.ddd = ddd;
		this.telefone = telefone;
		this.tipoFone = tipoFone;
		this.ramal = ramal;
	}

	public Telefone() {
		super();
	}

	public short getDdd() {
		return ddd;
	}

	public void setDdd(short ddd) {
		this.ddd = ddd;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getTipoFone() {
		return tipoFone;
	}

	public void setTipoFone(String tipoFone) {
		this.tipoFone = tipoFone;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
}
