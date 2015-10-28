package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Hospedagem;
import br.com.fiap.beans.Pagamento;
import br.com.fiap.beans.Reserva;
import br.com.fiap.beans.TipoPagamento;

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

	public int insertPagamentoDinheiro(Pagamento pagamento, Connection conn) throws Exception{
		
		String sql = "INSERT INTO T_AM_AFC_PAGAMENTO(CD_HOSPEDAGEM, CD_TIPO_FORMAPAG, DT_PAGAMENTO, VL_PAGAMENTO) "
				+ "VALUES(?,?,?,?)";
		
		PreparedStatement estrutura1 = conn.prepareStatement(sql);
		estrutura1.setInt(1, pagamento.getHospedagem().getCdHospedagem());
		estrutura1.setInt(2, pagamento.getTipoPagamento().getCdTipoPagamento());
		estrutura1.setString(3, df.format(pagamento.getDtSaida()));
		estrutura1.setDouble(4, pagamento.getHospedagem().getVlTotalHospedagem());
		
		
		return 1;
	}
	
	
	public void deletePagamentoCartao(Pagamento pagamento, Connection conn) throws Exception{
		
		String sql = "DELETE FROM T_AM_AFC_PAGAMENTO WHERE CD_HOSPEDAGEM = ?";
		
		PreparedStatement estrutura1 = conn.prepareStatement(sql);
		
		estrutura1.setInt(1, pagamento.getHospedagem().getCdHospedagem());
		estrutura1.execute();
		
		sql = "DELETE FROM T_AM_AFC_PAGCARTAO WHERE CD_HOSPEDAGEM = ?";
		
		PreparedStatement estrutura2 = conn.prepareStatement(sql);
		
		estrutura2.setInt(1, pagamento.getHospedagem().getCdHospedagem());
		estrutura2.execute();
		
		
	}
	
	public void deletePagamentoCheque(Pagamento pagamento, Connection conn) throws Exception{
		
		String sql = "DELETE FROM T_AM_AFC_PAGAMENTO WHERE CD_HOSPEDAGEM = ?";
		
		PreparedStatement estrutura1 = conn.prepareStatement(sql);
		
		estrutura1.setInt(1, pagamento.getHospedagem().getCdHospedagem());
		estrutura1.execute();
		
		sql = "DELETE FROM T_AM_AFC_PAG_CHEQUE WHERE CD_HOSPEDAGEM = ?";
		
		PreparedStatement estrutura2 = conn.prepareStatement(sql);
		
		estrutura2.setInt(1, pagamento.getHospedagem().getCdHospedagem());
		estrutura2.execute();
		
		sql = "DELETE FROM T_AM_AFC_REL_CHEQUE WHERE CD_HOSPEDAGEM = ?";
		
		PreparedStatement estrutura3 = conn.prepareStatement(sql);
		
		estrutura3.setInt(1, pagamento.getHospedagem().getCdHospedagem());
		estrutura3.execute();
		
	}
	
	public void deletePagamentoDinheiro(Pagamento pagamento, Connection conn) throws Exception{
		
		String sql = "DELETE FROM T_AM_AFC_PAGAMENTO WHERE CD_HOSPEDAGEM = ?";
		
		PreparedStatement estrutura1 = conn.prepareStatement(sql);
		
		estrutura1.setInt(1, pagamento.getHospedagem().getCdHospedagem());
		estrutura1.execute();
		
		sql = "DELETE FROM T_AM_AFC_PAGCARTAO WHERE CD_HOSPEDAGEM = ?";
		
		PreparedStatement estrutura2 = conn.prepareStatement(sql);
		
		estrutura2.setInt(1, pagamento.getHospedagem().getCdHospedagem());
		estrutura2.execute();
		
		
	}
	
	public void updatePagamentoDinheiro(Connection conn, Pagamento pagamento) throws Exception{
		
		String sql = "UDPDATE T_AM_AFC_PAGAMENTO(CD_TIPO_FORMAPAG,DT_PAGAMENTO,VL_PAGAMENTO) VALUES(?,?,?)";
		
		PreparedStatement estrutura1 = conn.prepareStatement(sql);
		
		estrutura1.setInt(1,pagamento.getTipoPagamento().getCdTipoPagamento());
		estrutura1.setString(2, df.format(pagamento.getDtSaida()));
		estrutura1.setDouble(3, pagamento.getHospedagem().getVlTotalHospedagem());
		
		
	}
	
	public void updatePagamentoCartao(Connection conn, Pagamento pagamento) throws Exception{
		
		String sql = "UDPDATE T_AM_AFC_PAGAMENTO SET CD_TIPO_FORMAPAG = ?, "
				+ "DT_PAGAMENTO = ?, "
				+ "VL_PAGAMENTO = ? "
				+ "WHERE CD_HOSPEDAGEM = ? ";
		
		PreparedStatement estrutura1 = conn.prepareStatement(sql);
		
		estrutura1.setInt(1,pagamento.getTipoPagamento().getCdTipoPagamento());
		estrutura1.setString(2, df.format(pagamento.getDtSaida()));
		estrutura1.setDouble(3, pagamento.getHospedagem().getVlTotalHospedagem());
		estrutura1.setInt(4, pagamento.getHospedagem().getCdHospedagem());
		
		sql = "UDPDATE T_AM_AFC_PAGCARTAO SET QT_PARCELA = ? "
				+ "WHERE CD_HOSPEDAGEM = ?";
		
		PreparedStatement estrutura2= conn.prepareStatement(sql);
		
		estrutura2.setInt(1,2);
		estrutura2.setInt(4, pagamento.getHospedagem().getCdHospedagem());
		
	}
	
	
	public void updatePagamentoCheque(Connection conn, Pagamento pagamento) throws Exception{
		
		String sql = "UDPDATE T_AM_AFC_PAGAMENTO SET CD_TIPO_FORMAPAG = ?, "
				+ "DT_PAGAMENTO = ?, "
				+ "VL_PAGAMENTO = ? "
				+ "WHERE CD_HOSPEDAGEM = ? ";
		
		PreparedStatement estrutura1 = conn.prepareStatement(sql);
		
		estrutura1.setInt(1,pagamento.getTipoPagamento().getCdTipoPagamento());
		estrutura1.setString(2, df.format(pagamento.getDtSaida()));
		estrutura1.setDouble(3, pagamento.getHospedagem().getVlTotalHospedagem());
		estrutura1.setInt(4, pagamento.getHospedagem().getCdHospedagem());
		
		sql = "UDPDATE T_AM_AFC_PAG_CHEQUE SET NR_BANCO = ? "
				+ "WHERE CD_HOSPEDAGEM = ?";
		
		PreparedStatement estrutura2= conn.prepareStatement(sql);
		
		estrutura2.setInt(1,2);
		estrutura2.setInt(2, pagamento.getHospedagem().getCdHospedagem());
		
		sql = "UDPDATE T_AM_AFC_REL_CHEQUE SET NR_BANCO = ?,"
				+ "VL_PARCELA = ? "
				+ "WHERE CD_HOSPEDAGEM = ?";
		
		PreparedStatement estrutura3= conn.prepareStatement(sql);
		
		estrutura3.setInt(1,2);
		estrutura3.setDouble(2, pagamento.getHospedagem().getVlTotalHospedagem());
		estrutura3.setInt(3, pagamento.getHospedagem().getCdHospedagem());
		
	}
	
	public List<Pagamento> selectAllPagamentos(Connection conn) throws Exception{
		
		List<Pagamento> lstPagamento = new ArrayList<Pagamento>();
		
		String sql = "SELECT A.*, B.CD_PGTO_CARTAO, B.QT_PARCELA, C.CD_PGTO_CHEQUE, C.NR_BACO, "
				+ "D.NR_CHEQUE, D.VL_PARCELA, E.CD_TIPO_FORMAPAG, E.DS_TIPO_FORMAPAG "
				+ "FROM T_AM_AFC_PAGAMENTO A "
				+ "LEFT JOIN T_AM_AFC_PAGCARTAO B ON (A.CD_HOSPEDAGEM = B.CD_HOSPEDAGEM)"
				+ "LEFT JOIN T_AM_AFC_PAG_CHEQUE C ON (A.CD_HOSPEDAGEM = C.CD_HOSPEDAGEM)"
				+ "LEFT JOIN T_AM_AFC_REL_CHEQUE D ON (C.CD_PGTO_CHEQUE = D.CD_PGTO_CHEQUE AND"
				+ "										C.CD_HOSPEDAGEM = D.CD_HOSPEDAGEM ) "
				+ "LEFT JOIN T_AM_AFC_TIPO_FORMAPAG E ON (A.CD_TIPO_FORMAPAG = A.CD_TIPO_FORMAPAG)";
		
		PreparedStatement estrutura1 = conn.prepareStatement(sql);
		
		ResultSet resultado = estrutura1.executeQuery();
				
		while(resultado.next()){
			Pagamento pagamento = new Pagamento();
			Hospedagem hospedagem = new Hospedagem();
			TipoPagamento tipoPagamento = new TipoPagamento();
			
			hospedagem.setCdHospedagem(resultado.getInt("CD_HOSPEDAGEM"));
			hospedagem.setVlTotalHospedagem(resultado.getInt("VL_PAGAMENTO"));
			pagamento.setHospedagem(hospedagem);
			tipoPagamento.setCdTipoPagamento(resultado.getInt("CD_TIPO_FORMAPAG"));
			tipoPagamento.setDsTipoPagamento(resultado.getString("DS_TIPO_FORMAPAG"));
			pagamento.setTipoPagamento(tipoPagamento);
			pagamento.setDtSaida(resultado.getDate("DT_PAGAMENTO"));
			
			lstPagamento.add(pagamento);
			
		}
		resultado.close();
		
		return lstPagamento;
	}
	
}
