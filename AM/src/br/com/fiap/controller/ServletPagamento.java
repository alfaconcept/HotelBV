package br.com.fiap.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.BO.HospedagemBO;
import br.com.fiap.beans.Consumo;
import br.com.fiap.beans.Hospedagem;
import br.com.fiap.conexao.ConnectionFactory;

/**
 * Servlet implementation class ServletPagamento
 */
public class ServletPagamento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPagamento() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("action").equals("checkOut")) {
			Connection conn = null;
			try {				
				conn = ConnectionFactory.controlarInstancia().getConnection();
				
				Hospedagem hospedagem = new Hospedagem();
				hospedagem.setCdHospedagem(Integer.parseInt(request.getParameter("nrHospedagem")));
				hospedagem = new HospedagemBO().consultarHospedagem(hospedagem, conn);
				
				List <Consumo> listConsumo = new ArrayList<Consumo>();
				listConsumo = new ConsumoBO().
				
				
				HttpSession session = request.getSession();
				session.setAttribute("hospedagem", hospedagem);
				
				request.getRequestDispatcher("ResultadoHospedagem.jsp").forward(request, response);
			} catch (Exception e) {
				StringWriter errors = new StringWriter();
				e.printStackTrace(new PrintWriter(errors));
				response.getWriter().print(errors.toString());
			}
		}		
	}
}
