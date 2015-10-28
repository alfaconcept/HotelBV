package br.com.fiap.BO;

import java.sql.Connection;


import br.com.fiap.DAO.HospedagemDAO;
import br.com.fiap.beans.Hospedagem;
import br.com.fiap.excecoes.Excecoes;

/**
* 
* Classe de Regra de negocio da Classe Hospedagem.
* @author Elisama Alencar
* @author Leonardo Savoia
* @author Marcus Ferraz
* @author Mauricio Grejanin
* @version 1.0
* @since 1.0
* @see Hospedagem
* @see HospedagemDAO 
* 
*/
public class HospedagemBO {
	
	/**
	* Metodo que consulta uma Hospedagem no banco. 
	* 
	* @param  Hospedagem hospedagem, Connection conn
	* @return objeto do tipo Hospedagem.
	* @author Elisama Alencar
	* @author Leonardo Savoia
	* @author Marcus Ferraz
	* @author Mauricio Grejanin
	* @see  Hospedagem
	*/
	public Hospedagem consultarHospedagem(Hospedagem hospedagem, Connection conn) throws Exception{
		if (hospedagem.getCdHospedagem() == 0) {
			throw new Excecoes("Por favor, informe o código de hospedagem para registrar o Check Out");
		}		
		return new HospedagemDAO().findHospedagem(hospedagem, conn);
	}
}
