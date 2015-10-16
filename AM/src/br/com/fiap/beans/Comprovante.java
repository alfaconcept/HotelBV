package br.com.fiap.beans;

public class Comprovante {
	private Hospedagem hospedagem;
	private Pagamento pagamento;
	
	public Comprovante(Hospedagem hospedagem, Pagamento pagamento) {
		super();
		this.hospedagem = hospedagem;
		this.pagamento = pagamento;
	}

	public Comprovante() {
		super();
	}

	public Hospedagem getHospedagem() {
		return hospedagem;
	}

	public void setHospedagem(Hospedagem hospedagem) {
		this.hospedagem = hospedagem;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
}
