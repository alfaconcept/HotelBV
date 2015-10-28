package br.com.fiap.BO;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.beans.Consumo;
import br.com.fiap.beans.Hospedagem;
import br.com.fiap.excecoes.Excecoes;

public class ConsumoBO {
	public List<Consumo> listarConsumos(Hospedagem hospedagem, Connection conn) throws Exception{
		
		if (hospedagem.getCdHospedagem() == 0) {
			throw new Excecoes("Código de hospedagem inválido");
		}
		
		return new ConsumoDAO().listConsumo(hospedagem, conn);
	}
}
