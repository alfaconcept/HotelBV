package br.com.fiap.beans;

public class Quarto {
	private TipoQuarto tipoQuarto;
	private int nrAndar;
	private int nrQuarto;
	private String status;
	
	public Quarto(TipoQuarto tipoQuarto, int nrAndar,
			int nrQuarto, String status) {
		super();
		this.tipoQuarto = tipoQuarto;
		this.nrAndar = nrAndar;
		this.nrQuarto = nrQuarto;
		this.status = status;
	}

	public Quarto() {
		super();
	}

	public TipoQuarto getTipoQuarto() {
		return tipoQuarto;
	}

	public void setTipoQuarto(TipoQuarto tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}

	public int getNrAndar() {
		return nrAndar;
	}

	public void setNrAndar(int nrAndar) {
		this.nrAndar = nrAndar;
	}

	public int getNrQuarto() {
		return nrQuarto;
	}

	public void setNrQuarto(int nrQuarto) {
		this.nrQuarto = nrQuarto;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
