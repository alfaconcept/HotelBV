package br.com.fiap.BO;

import java.util.List;

import br.com.fiap.beans.Quarto;
import br.com.fiap.excecoes.Excecoes;

public class QuartoBO {
	
	public void inserirQuarto(Quarto quarto) throws Exception{
		if(quarto.getTipoQuarto().equals("")){
			throw new Excecoes("Por favor, informe o tipo do quarto");
			
		}
		
		if(quarto.getNrQuarto() == 0) {
			throw new Excecoes("Por favor, informe o n�mero do quarto");
		}
		
		if(quarto.getNrAndar() == 0 ){
			throw new Excecoes("Por favor, informe o n�mero do andar");
		}
		
		
	}
	
	 //new QuartoDAO().insertQuarto(quarto);
	
	public Quarto pesquisarQuarto(int cdQuarto) throws Exception{
		if(cdQuarto == 0){
			throw new Excecoes("Por favor, informe o c�digo do quarto para realizar a busca");
		}
		
		//return new QuartoDAO().findQuarto(cdQuarto);
		
		return null; //REMOVER ESTA LINHA AP�S CRIAR OS M�TODOS DAO
	}
	
	
	 public List<Quarto> listarQuarto() throws Exception{
		 //return new QuartoDAO().selectAllQuarto();
		 return null; // REMOVER ESTA LINHA AP�S CRIAR OS M�TODOS DAO
	 }
	 
	 
	 public void atualizarQuarto(Quarto quarto) throws Exception{
		 if(quarto.getTipoQuarto().equals("")){
				throw new Excecoes("Por favor, informe o tipo do quarto");
				
			}
			
			if(quarto.getNrQuarto() == 0) {
				throw new Excecoes("Por favor, informe o n�mero do quarto");
			}
			
			if(quarto.getNrAndar() == 0 ){
				throw new Excecoes("Por favor, informe o n�mero do andar");
			}
			
		 //new QuartoDAO().updateQuarto(quarto);
	 }
	 
	 public void deletarQuarto(int cdQuarto) throws Exception{
		 if(cdQuarto == 0){
			 throw new Excecoes("Por favor, informe o c�digo do cliente");
			 // new QuartoDAO().deleteQuarto(cdQuarto);
			 
		 }
	 }
	
	
}