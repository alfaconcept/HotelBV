package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Consumo;
import br.com.fiap.beans.Hospedagem;
import br.com.fiap.beans.ProdutoServico;

public class ConsumoDAO {

	public List<Consumo> listConsumo(Hospedagem hospedagem, Connection conn) throws Exception{
		
		List<Consumo>lstConsumo = new ArrayList<Consumo>();
		
		
		String sql = 	"SELECT "
				+"  A.CD_HOSPEDAGEM, "
				+"  B.CD_CONSUMO, "
				+"    B.CD_TIPO_SERVICO, "
				+"    C.DS_SERVICO, "
				+"    B.QT_CONSUMO, "
				+"    D.VL_PRECO VALOR_UNITARIO, "
				+"    B.QT_CONSUMO * D.VL_PRECO VALOR_TOTAL "
				+"  FROM "
				+"    T_AM_AFC_HOSPEDAGEM A "
				+"  INNER JOIN "
				+"    T_AM_AFC_CONSUMO B ON (A.CD_HOSPEDAGEM = B.CD_HOSPEDAGEM) "
				+"  INNER JOIN "
				+"    T_AM_AFC_PRODUTO_SERVICO C ON (B.CD_TIPO_SERVICO = C.CD_TIPO_SERVICO) "
				+"  INNER JOIN "
				+"    T_AM_AFC_HIST_PRECO D ON (D.CD_TIPO_SERVICO = C.CD_TIPO_SERVICO "
				+"                              AND D.DT_VALIDADE IN ( "
				+"                                                    SELECT " 
				+"                                                      MAX(DT_VALIDADE) " 
				+"                                                    FROM "
				+"                                                      T_AM_AFC_HIST_PRECO "
				+"                                                    WHERE "
				+"                                                      CD_TIPO_SERVICO = C.CD_TIPO_SERVICO "
				+"                                                      AND DT_VALIDADE <= (SELECT SYSDATE FROM DUAL) "
				+"                                                     ) "
				+"                            ) "
				+"WHERE " 
				+"  A.CD_HOSPEDAGEM = ? ";
		
		PreparedStatement estrutura = conn.prepareCall(sql);
		estrutura.setInt(1, hospedagem.getCdHospedagem());
		ResultSet resultado = estrutura.executeQuery();
		
		while(resultado.next()){
			Consumo consumo = new Consumo();
			ProdutoServico produtoServico = new ProdutoServico();
			
			produtoServico.setCdTipoServico(resultado.getInt("CD_TIPO_SERVICO"));
			produtoServico.setDsServico(resultado.getString("DS_SERVICO"));
			consumo.setCdConsumo(resultado.getInt("CD_CONSUMO"));
			consumo.setTipoServico(produtoServico);
			consumo.setQtConsumo(resultado.getInt("QT_CONSUMO"));
			consumo.setVlServicoTotal(resultado.getDouble("VALOR_TOTAL"));
			
			lstConsumo.add(consumo);
			
		}
		
		return lstConsumo;
	}
	
}
