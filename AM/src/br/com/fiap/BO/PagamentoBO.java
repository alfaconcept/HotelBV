package br.com.fiap.BO;

import java.sql.Connection;

import br.com.fiap.DAO.PagamentoDAO;
import br.com.fiap.beans.Hospedagem;
import br.com.fiap.beans.Pagamento;
import br.com.fiap.excecoes.Excecoes;

/**
* 
* Classe de Regra de negocio da Classe Pagamento.
* @author Elisama Alencar
* @author Leonardo Savoia
* @author Marcus Ferraz
* @author Mauricio Grejanin
* @version 1.0
* @since 1.0
* @see Pagamento
* @see PagamentoDAO 
* 
*/
public class PagamentoBO {
	
	/**
	* Metodo que valida os dados informados de cadastro de Pagamento antes de inserir no banco. 
	* 
	* @param  Connection conexao, Pagamento pagamento
	* @return objeto do tipo Pagamento.
	* @author Elisama Alencar
	* @author Leonardo Savoia
	* @author Marcus Ferraz
	* @author Mauricio Grejanin
	* @see  Pagamento
	*/
	public int inserirPagamento(Connection conexao, Pagamento pagamento) throws Exception{
		
		new PagamentoDAO().insertPagamentoCartao(pagamento, conexao);
		
		return 1;
	}
	
	/**
	* Metodo que valida se o código da hospedagem foi preenchido para efetuar a busca do pagamento pelo
	* PagamentoDAO.
	*  
	* @param  Connection conexao, Hospedagem hospedagem
	* @return objeto do tipo Pagamento.
	* @author Elisama Alencar
	* @author Leonardo Savoia
	* @author Marcus Ferraz
	* @author Mauricio Grejanin
	* @see  Pagamento
	*/
	
	public Pagamento retornaPagamento(Hospedagem hospedagem, Connection conn) throws Exception{
		
		if(hospedagem.getCdHospedagem() == 0){
			throw new Excecoes("Código da Hospedagem não informado");
		}
		
		return new PagamentoDAO().returnPagamento(hospedagem, conn);
				
	}
}
