package br.com.fiap.beans;

public class ProdutoServico {
	private int cdTipoServico;
	private String dsServico;
	private boolean nrTipo;
	private double vlProdutoServico;
	
	public ProdutoServico(int cdTipoServico, String dsServico, boolean nrTipo,
			double vlProdutoServico) {
		super();
		this.cdTipoServico = cdTipoServico;
		this.dsServico = dsServico;
		this.nrTipo = nrTipo;
		this.vlProdutoServico = vlProdutoServico;
	}

	public ProdutoServico() {
		super();
	}

	public int getCdTipoServico() {
		return cdTipoServico;
	}

	public void setCdTipoServico(int cdTipoServico) {
		this.cdTipoServico = cdTipoServico;
	}

	public String getDsServico() {
		return dsServico;
	}

	public void setDsServico(String dsServico) {
		this.dsServico = dsServico;
	}

	public boolean isNrTipo() {
		return nrTipo;
	}

	public void setNrTipo(boolean nrTipo) {
		this.nrTipo = nrTipo;
	}

	public double getVlProdutoServico() {
		return vlProdutoServico;
	}

	public void setVlProdutoServico(double vlProdutoServico) {
		this.vlProdutoServico = vlProdutoServico;
	}
	
}
