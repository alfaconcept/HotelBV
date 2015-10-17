package br.com.fiap.BO;

import java.util.List;

import br.com.fiap.beans.TipoQuarto;
import br.com.fiap.excecoes.Excecoes;

public class TipoQuartoBO {
	
	public void inserirTipoQuartoBO(TipoQuarto tipoQuarto) throws Exception{
		if (tipoQuarto.getDsTipoQuarto().equals("")) {
			throw new Excecoes("Por favor, informe a descri��o do tipo de quarto");
		}
		
		if (tipoQuarto.getVlTipoQuarto() == 0) {
			throw new Excecoes("Por favor, informe o valor do tipo de quarto");
		}
		
		// return TipoQuartoDAO().insertTipoQuarto(tipoQuarto);
	}
	
	public TipoQuarto pesquisarTipoQuarto(int codTipoQuarto) throws Exception{
		if (codTipoQuarto == 0) {
			throw new Excecoes("Por favor, informe o c�digo do tipo de quarto para realizar a busca");
		}
		
		// return new TipoQuartoDAO().findTipoQuarto(codTipoQuarto);
		
		return null; // REMOVER ESTA LINHA AP�S CRIAR OS M�TODOS DAO
	}
	
	public List<TipoQuarto> listarTipoQuarto() throws Exception{
		// return new TipoQuartoDAO().selectAllTipoQuarto();
		return null; // REMOVER ESTA LINHA AP�S CRIAR OS M�TODOS DAO
	}
	
	public void atualizarTipoQuarto(TipoQuarto tipoQuarto)  throws Exception{
		if (tipoQuarto.getCodTipoQuarto() == 0) {
			throw new Excecoes("Por favor, informe o c�digo do tipo de quarto");
		}
		
		if (tipoQuarto.getDsTipoQuarto().equals("")) {
			throw new Excecoes("Por favor, informe a descri��o do tipo de quarto");
		}
		
		if (tipoQuarto.getVlTipoQuarto() == 0) {
			throw new Excecoes("Por favor, informe o valor do tipo de quarto");
		}
		
		// return TipoQuartoDAO().updateTipoQuarto(tipoQuarto);
	}
	
	public void deletarTipoQuarto(int codTipoQuarto) throws Exception{
		if (codTipoQuarto== 0) {
			throw new Excecoes("Por favor, informe o c�digo do tipo de quarto");
		}
		
		// new TipoQuartoDAO().deleteTipoQuarto(codTipoQuarto);
	}
}
