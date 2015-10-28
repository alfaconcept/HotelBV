package br.com.fiap.BO;

import java.sql.Connection;

import br.com.fiap.DAO.PagamentoDAO;
import br.com.fiap.beans.Hospedagem;
import br.com.fiap.beans.Pagamento;
import br.com.fiap.excecoes.Excecoes;

public class PagamentoBO {

	public int inserirPagamento(Connection conexao, Pagamento pagamento) throws Exception{
		
		new PagamentoDAO().insertPagamentoCartao(pagamento, conexao);
		
		return 1;
	}
	
	public Pagamento retornaPagamento(Hospedagem hospedagem, Connection conn) throws Exception{
		
		if(hospedagem.getCdHospedagem() == 0){
			throw new Excecoes("Código da Hospedagem não informado ");
		}
		
		return new PagamentoDAO().returnPagamento(hospedagem, conn);
	}
}
