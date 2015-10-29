package br.com.fiap.BO;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.DAO.TipoQuartoDAO;
import br.com.fiap.beans.Hospedagem;
import br.com.fiap.beans.TipoQuarto;
import br.com.fiap.excecoes.Excecoes;

public class TipoQuartoBO {
	
	public void inserirTipoQuartoBO(TipoQuarto tipoQuarto) throws Exception{
		if (tipoQuarto.getDsTipoQuarto().equals("")) {
			throw new Excecoes("Por favor, informe a descrição do tipo de quarto");
		}
		
		if (tipoQuarto.getVlTipoQuarto() == 0) {
			throw new Excecoes("Por favor, informe o valor do tipo de quarto");
		}
		
		// return TipoQuartoDAO().insertTipoQuarto(tipoQuarto);
	}
	
	public TipoQuarto pesquisarTipoQuarto(TipoQuarto tipoQuarto, Connection conn) throws Exception{
		if (tipoQuarto.getDsTipoQuarto().equals("")) {
			throw new Excecoes("Por favor, informe o tipo de quarto para realizar a busca");
		}
		
		 return new TipoQuartoDAO().findTipoQuarto(tipoQuarto, conn);
	
	}
	
	public TipoQuarto pesquisarTipoQuarto(Hospedagem hospedagem, Connection conn) throws Exception{
		if (hospedagem.getCdHospedagem() == 0) {
			throw new Excecoes("Por favor, informe o tipo de quarto para realizar a busca");
		}
		
		 return new TipoQuartoDAO().findTipoQuarto(hospedagem, conn);
	
	}
	
	public List<TipoQuarto> listarTipoQuarto() throws Exception{
		// return new TipoQuartoDAO().selectAllTipoQuarto();
		return null; // REMOVER ESTA LINHA APÓS CRIAR OS MÉTODOS DAO
	}
	
	public void atualizarTipoQuarto(TipoQuarto tipoQuarto)  throws Exception{
		if (tipoQuarto.getCodTipoQuarto() == 0) {
			throw new Excecoes("Por favor, informe o código do tipo de quarto");
		}
		
		if (tipoQuarto.getDsTipoQuarto().equals("")) {
			throw new Excecoes("Por favor, informe a descrição do tipo de quarto");
		}
		
		if (tipoQuarto.getVlTipoQuarto() == 0) {
			throw new Excecoes("Por favor, informe o valor do tipo de quarto");
		}
		
		// return TipoQuartoDAO().updateTipoQuarto(tipoQuarto);
	}
	
	public void deletarTipoQuarto(int codTipoQuarto) throws Exception{
		if (codTipoQuarto== 0) {
			throw new Excecoes("Por favor, informe o código do tipo de quarto");
		}
		
		// new TipoQuartoDAO().deleteTipoQuarto(codTipoQuarto);
	}
}
