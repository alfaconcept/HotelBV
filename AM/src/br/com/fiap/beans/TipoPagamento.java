package br.com.fiap.beans;

public class TipoPagamento {
	private int cdTipoPagamento;
	private String dsTipoPagamento;
	
	public TipoPagamento(int cdTipoPagamento, String dsTipoPagamento) {
		super();
		this.cdTipoPagamento = cdTipoPagamento;
		this.dsTipoPagamento = dsTipoPagamento;
	}

	public TipoPagamento() {
		super();
	}

	public int getCdTipoPagamento() {
		return cdTipoPagamento;
	}

	public void setCdTipoPagamento(int cdTipoPagamento) {
		this.cdTipoPagamento = cdTipoPagamento;
	}

	public String getDsTipoPagamento() {
		return dsTipoPagamento;
	}

	public void setDsTipoPagamento(String dsTipoPagamento) {
		this.dsTipoPagamento = dsTipoPagamento;
	}
	
}
