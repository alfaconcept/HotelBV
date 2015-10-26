package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.beans.Hospedagem;

public class HospedagemDAO {
	
	public Hospedagem findHospedagem(Hospedagem hospedagem, Connection conn) throws Exception {
		String sql = "SELECT * from T_AM_AFC_HOSPEDAGEM WHERE CD_HOSPEDAGEM = ?";
		
		PreparedStatement estrutura = conn.prepareStatement(sql);
		estrutura.setInt(1, hospedagem.getCdHospedagem());
		
		ResultSet resultado = estrutura.executeQuery();
		
		while (resultado.next()) {
			Hospedagem hosp = new Hospedagem();
			hosp.setCdHospedagem(resultado.getInt("CD_HOSPEDAGEM"));
			resultado.close();
			estrutura.close();
			return hosp;
		}
		
		return null;
	}
	
}
