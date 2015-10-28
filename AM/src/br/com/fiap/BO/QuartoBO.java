package br.com.fiap.BO;

import java.sql.Connection;

import java.util.List;

import br.com.fiap.DAO.QuartoDAO;
import br.com.fiap.beans.Quarto;
import br.com.fiap.beans.Reserva;
import br.com.fiap.excecoes.Excecoes;

/**
* 
* Classe de Regra de negзcio da Classe Quarto.
* @author Elisama Alencar
* @author Leonardo Savoia
* @author Marcus Ferraz
* @author Mauricio Grejanin
* @version 1.0
* @since 1.0
* @see Quarto
* @see QuartoDAO 
* 
*/
public class QuartoBO {
	
	/**
	* Metodo que valida os dados informados de cadastro do Quarto antes de inserir no banco. 
	* 
	* @param Quarto quarto, Connection conn
	* @return objeto do tipo Quarto.
	* @author Elisama Alencar
	* @author Leonardo Savoia
	* @author Marcus Ferraz
	* @author Mauricio Grejanin
	* @see  Quarto
	*/
	public void inserirQuarto(Quarto quarto, Connection conn) throws Exception{
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
	
	
	/**
	* Metodo que pesquisa uma Quarto no banco. 
	* 
	* @param  Quarto quarto, Connection conn
	* @return objeto do tipo Quarto
	* @author Elisama Alencar
	* @author Leonardo Savoia
	* @author Marcus Ferraz
	* @author Mauricio Grejanin
	* @see  Quarto
	*/
	public Quarto pesquisarQuarto(Quarto quarto, Connection conn) throws Exception{
		if(quarto.getTipoQuarto().getCodTipoQuarto() == 0){
			throw new Excecoes("Por favor, informe o código do tipo de quarto para realizar a busca");
		}
		
		return new QuartoDAO().findQuarto(quarto, conn);
	}
	
	
	/**
	* Metodo que retorna uma lista com todas os Quartos cadastradas no banco de dados. 
	* 
	* @param Quarto quarto, Connection conn
	* @return lista do tipo Quarto
	* @author Elisama Alencar
	* @author Leonardo Savoia
	* @author Marcus Ferraz
	* @author Mauricio Grejanin
	* @see  Quarto
	*/
	 public List<Quarto> listarQuarto(Quarto quarto, Connection conn) throws Exception{
		 //return new QuartoDAO().selectAllQuarto();
		 return null; // REMOVER ESTA LINHA APÓS CRIAR OS MÉTODOS DAO
	 }
	 
	 
	 /**
		* Metodo que valida os dados enviados para registrar uma alteraсao no Quarto. 
		* 
		* @param Quarto quarto, Connection conn
		* @return  void
		* @author Elisama Alencar
		* @author Leonardo Savoia
		* @author Marcus Ferraz
		* @author Mauricio Grejanin
		* @see  Quarto
		*/
	 public void atualizarQuarto(Quarto quarto, Connection conn) throws Exception{
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
	 
	 
	 /**
		* Metodo que chama o metodo deletar da classe QuartoDao. 
		* 
		* @param Quarto quarto, Connection conn
		* @return  void
		* @author Elisama Alencar
		* @author Leonardo Savoia
		* @author Marcus Ferraz
		* @author Mauricio Grejanin
		* @see  Quarto
		*/
	 public void deletarQuarto(Quarto quarto, Connection conn) throws Exception{
		 if(quarto.getNrQuarto() == 0){
			 throw new Excecoes("Por favor, informe o código do cliente");
			 // new QuartoDAO().deleteQuarto(cdQuarto);
			 
		 }
	 }
	 
	 
	 /**
		* Metodo que atualiza o status da classe Quarto. 
		* 
		* @param Reserva reserva, Connection conn
		* @return  void
		* @author Elisama Alencar
		* @author Leonardo Savoia
		* @author Marcus Ferraz
		* @author Mauricio Grejanin
		* @see  Quarto
		*/
	 public void atualizarStatusQuarto(Reserva reserva, Connection conn) throws Exception{
		 
		 if(reserva.getCdReserva() == 0){
			 throw new Excecoes("Código de reserva inválido");
		 }
		 
		 if (reserva.getQuarto().getStatus().equals("")) {
			throw new Excecoes("Status de reserva inválido");
		}
		 
		 new QuartoDAO().updateStatusQuarto(reserva, conn);
		 
	 }
	
	
}

