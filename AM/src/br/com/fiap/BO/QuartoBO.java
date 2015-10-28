package br.com.fiap.BO;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.DAO.QuartoDAO;
import br.com.fiap.beans.Quarto;
import br.com.fiap.beans.Reserva;
import br.com.fiap.excecoes.Excecoes;

public class QuartoBO {
	
	public void inserirQuarto(Quarto quarto) throws Exception{
		if(quarto.getTipoQuarto().equals("")){
			throw new Excecoes("Por favor, informe o tipo do quarto");
			
		}
		
		if(quarto.getNrQuarto() == 0) {
			throw new Excecoes("Por favor, informe o número do quarto");
		}
		
		if(quarto.getNrAndar() == 0 ){
			throw new Excecoes("Por favor, informe o número do andar");
		}
		
		
	}
	
	 //new QuartoDAO().insertQuarto(quarto);
	
	public Quarto pesquisarQuarto(Quarto quarto, Connection conn) throws Exception{
		if(quarto.getTipoQuarto().getCodTipoQuarto() == 0){
			throw new Excecoes("Por favor, informe o código do tipo de quarto para realizar a busca");
		}
		
		return new QuartoDAO().findQuarto(quarto, conn);
	}
	
	
	 public List<Quarto> listarQuarto() throws Exception{
		 //return new QuartoDAO().selectAllQuarto();
		 return null; // REMOVER ESTA LINHA APÓS CRIAR OS MÉTODOS DAO
	 }
	 
	 
	 public void atualizarQuarto(Quarto quarto) throws Exception{
		 if(quarto.getTipoQuarto().equals("")){
				throw new Excecoes("Por favor, informe o tipo do quarto");
				
			}
			
			if(quarto.getNrQuarto() == 0) {
				throw new Excecoes("Por favor, informe o número do quarto");
			}
			
			if(quarto.getNrAndar() == 0 ){
				throw new Excecoes("Por favor, informe o número do andar");
			}
			
		 //new QuartoDAO().updateQuarto(quarto);
	 }
	 
	 public void deletarQuarto(int cdQuarto) throws Exception{
		 if(cdQuarto == 0){
			 throw new Excecoes("Por favor, informe o código do cliente");
			 // new QuartoDAO().deleteQuarto(cdQuarto);
			 
		 }
	 }
	 
	 public void atualizarStatusQuarto(Reserva reserva, Connection conn) throws Exception{
		 
		 if(reserva.getCdReserva() == 0){
			 throw new Excecoes("Codígo de reserva invalido");
		 }
		 
		 new QuartoDAO().updateStatusQuarto(reserva, conn);
		 
	 }
	
	
}

