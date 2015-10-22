package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Pagamento;
import br.com.fiap.beans.Reserva;

public class PagamentoDAO {
	
	DateFormat df = new SimpleDateFormat("yyyy-MM-aa");

	public int insertPagamentoCartao(Pagamento pagamento, Connection conn) throws Exception{
		
		String sql = "INSERT INTO T_AM_AFC_PAGAMENTO(CD_HOSPEDAGEM, CD_TIPO_FORMAPAG, DT_PAGAMENTO, VL_PAGAMENTO) "
				+ "VALUES(?,?,?,?)";
		
		PreparedStatement estrutura1 = conn.prepareStatement(sql);
		estrutura1.setInt(1, pagamento.getHospedagem().getCdHospedagem());
		estrutura1.setInt(2, pagamento.getTipoPagamento().getCdTipoPagamento());
		estrutura1.setString(3, df.format(pagamento.getDtSaida()));
		estrutura1.setDouble(4, pagamento.getHospedagem().getVlTotalHospedagem());
		
		estrutura1.execute();
		
		sql = "INSERT INTO T_AM_AFC_PAGCARTAO(CD_PGTO_CARTAO,CD_HOSPEDAGEM,QT_PARCELA)"
				+ "VALUES(SQ_AM_AFC_Pagto_Cartao.nextval,?,?)";
		PreparedStatement estrutura2 = conn.prepareStatement(sql);
		estrutura2.setInt(1, pagamento.getHospedagem().getCdHospedagem());
		estrutura2.setInt(2,1);//NÃO TEM NO CASE CLASSE PAGCARTAO
		
		return 1;
	}
	
public int insertPagamentoCheque(Reserva reserva, Connection conn, Pagamento pagamento) throws Exception{
		
		String sql = "INSERT INTO T_AM_AFC_PAGAMENTO(CD_HOSPEDAGEM, CD_TIPO_FORMAPAG, DT_PAGAMENTO, VL_PAGAMENTO) "
				+ "VALUES(?,?,?,?)";
		
		PreparedStatement estrutura1 = conn.prepareStatement(sql);
		estrutura1.setInt(1, pagamento.getHospedagem().getCdHospedagem());
		estrutura1.setInt(2, pagamento.getTipoPagamento().getCdTipoPagamento());
		estrutura1.setString(3, df.format(pagamento.getDtSaida()));
		estrutura1.setDouble(4, pagamento.getHospedagem().getVlTotalHospedagem());
		
		estrutura1.execute();
		
		sql = "INSERT INTO T_AM_AFC_PAG_CHEQUE(CD_PGTO_CHEQUE,CD_HOSPEDAGEM,NR_BANCO)"
				+ "VALUES(SQ_AM_AFC_Pagto_Cheque.nextval,?,?)";
		
		PreparedStatement estrutura2 = conn.prepareStatement(sql);
		estrutura2.setInt(1, pagamento.getHospedagem().getCdHospedagem());
		estrutura2.setInt(2,33);
		
		estrutura2.execute();

		sql = "INSERT INTO T_AM_AFC_REL_CHEQUE(CD_PGTO_CHEQUE,CD_HOSPEDAGEM,NR_CHEQUE,VL_PARCELA)"
				+ "VALUES(SQ_AM_AFC_Pagto_Cheque.currval,?,?)";
		
		PreparedStatement estrutura3 = conn.prepareStatement(sql);
		estrutura3.setInt(1, pagamento.getHospedagem().getCdHospedagem());
		estrutura3.setInt(2,1234);
		estrutura3.setDouble(3,pagamento.getHospedagem().getVlTotalHospedagem());
		
		estrutura3.execute();
		
		
		return 1;
	}
	
	public List<Pagamento> listPagamento(int cdReserva, Connection conexao) throws Exception{
		List<Pagamento> pagamento = new ArrayList<Pagamento>();
		
		
		return pagamento;
	}
}
