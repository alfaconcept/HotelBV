package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Funcionario;
import br.com.fiap.beans.Hospedagem;
import br.com.fiap.beans.Quarto;
import br.com.fiap.beans.Reserva;

public class HospedagemDAO {
	
	public Hospedagem findHospedagem(Hospedagem hospedagem, Connection conn) throws Exception {
		String sql = "SELECT * from T_AM_AFC_HOSPEDAGEM WHERE CD_HOSPEDAGEM = ?";
		
		PreparedStatement estrutura = conn.prepareStatement(sql);
		estrutura.setInt(1, hospedagem.getCdHospedagem());
		
		ResultSet resultado = estrutura.executeQuery();
		
		while (resultado.next()) {
			Hospedagem hosp = new Hospedagem();
			Reserva reserva = new Reserva();
			Quarto quarto = new Quarto();
			Cliente cliente = new Cliente();
			Funcionario funcionario = new Funcionario();
			cliente.setCdPessoa(resultado.getInt("CD_CLIENTE"));
			quarto.setNrQuarto(resultado.getInt("NR_QUARTO"));
			reserva.setCdReserva(resultado.getInt("CD_RESERVA"));
			reserva.setTipoQuarto(quarto);
			reserva.setCliente(cliente);
			funcionario.setCdPessoa(resultado.getInt("CD_FUNCIONARIO"));
			hosp.setFuncionario(funcionario);
			hosp.setReserva(reserva);
			hosp.setCdHospedagem(resultado.getInt("CD_HOSPEDAGEM"));			
			hosp.setDtEntrada(resultado.getDate("DT_ENTRADA"));
			hosp.setDtSaida(resultado.getDate("DT_SAIDA"));
			resultado.close();
			estrutura.close();
			return hosp;
		}		
		return null;
	}
	
}
