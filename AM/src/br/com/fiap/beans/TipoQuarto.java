package br.com.fiap.beans;

public class TipoQuarto {
	private int codTipoQuarto;
	private String dsTipoQuarto;
	private double vlTipoQuarto;
	
	public TipoQuarto(int codTipoQuarto, String dsTipoQuarto,
			double vlTipoQuarto) {
		super();
		this.codTipoQuarto = codTipoQuarto;
		this.dsTipoQuarto = dsTipoQuarto;
		this.vlTipoQuarto = vlTipoQuarto;
	}

	public TipoQuarto() {
		super();
	}

	public int getCodTipoQuarto() {
		return codTipoQuarto;
	}

	public void setCodTipoQuarto(int codTipoQuarto) {
		this.codTipoQuarto = codTipoQuarto;
	}

	public String getDsTipoQuarto() {
		return dsTipoQuarto;
	}

	public void setDsTipoQuarto(String dsTipoQuarto) {
		this.dsTipoQuarto = dsTipoQuarto;
	}

	public double getVlTipoQuarto() {
		return vlTipoQuarto;
	}

	public void setVlTipoQuarto(double vlTipoQuarto) {
		this.vlTipoQuarto = vlTipoQuarto;
	}
}
