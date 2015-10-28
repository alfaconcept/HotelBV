package br.com.fiap.BO;

import java.sql.Connection;

import br.com.fiap.DAO.PagamentoDAO;
import br.com.fiap.beans.Pagamento;

public class PagamentoBO {

	public int inserirPagamento(Connection conexao, Pagamento pagamento) throws Exception{
		
		new PagamentoDAO().insertPagamentoCartao(pagamento, conexao);
		
		return 1;
	}
}
