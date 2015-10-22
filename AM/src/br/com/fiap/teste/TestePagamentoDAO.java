package br.com.fiap.teste;

import java.sql.Connection;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.fiap.BO.PagamentoBO;
import br.com.fiap.beans.Hospedagem;
import br.com.fiap.beans.Pagamento;
import br.com.fiap.beans.TipoPagamento;
import br.com.fiap.conexao.ConnectionFactory;
import br.com.fiap.excecoes.Excecoes;

public class TestePagamentoDAO {

	public static void main(String[] args) throws Excecoes {
		// TODO Auto-generated method stub
		Connection conexao = null;
		Pagamento pagamento = new Pagamento();
		Hospedagem hospedagem = new Hospedagem();
		TipoPagamento tipoPagamento = new TipoPagamento();
		Date data = new Date(System.currentTimeMillis());
		
		hospedagem.setCdHospedagem(Integer.parseInt(JOptionPane.showInputDialog("Informe a Hospedagem")));
		hospedagem.setVlTotalHospedagem(Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor total da Hospedagem")));
		pagamento.setHospedagem(hospedagem);
		tipoPagamento.setCdTipoPagamento(Integer.parseInt(JOptionPane.showInputDialog("Informe o Tipo de Pagamento")));
		pagamento.setTipoPagamento(tipoPagamento);
		pagamento.setDtSaida(data);

		
		try{
			conexao = ConnectionFactory.controlarInstancia().getConnection();
			conexao.setAutoCommit(false);
			
			new PagamentoBO().inserirPagamento(conexao, pagamento);
			
			conexao.commit();
			conexao.setAutoCommit(true);
			
		}catch(Exception e){
			
			//conexao.rollback();
			throw new Excecoes(e);
			
		}finally{
			try{
				conexao.close();
			}catch(Exception e){
				throw new Excecoes(e);
			}		
		}
		
	}

}
