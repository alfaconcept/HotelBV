package br.com.fiap.BO;

import java.sql.Connection;

import br.com.fiap.DAO.HospedagemDAO;
import br.com.fiap.beans.Hospedagem;
import br.com.fiap.excecoes.Excecoes;

public class HospedagemBO {
	public Hospedagem consultarHospedagem(Hospedagem hospedagem, Connection conn) throws Exception{
		if (hospedagem.getCdHospedagem() == 0) {
			throw new Excecoes("Por favor, informe o código de hospedagem para registrar o Check Out");
		}
		
		return new HospedagemDAO().findHospedagem(hospedagem, conn);
	}
}
