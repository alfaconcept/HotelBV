package br.com.fiap.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.BO.ClienteBO;
import br.com.fiap.BO.QuartoBO;
import br.com.fiap.BO.ReservaBO;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Quarto;
import br.com.fiap.beans.Reserva;

/**
 * Servlet implementation class ServletReserva
 */

public class ServletReserva extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletReserva() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("action").equals("reservar")) {
			try {				
							
				// Obtendo o cliente que esta fazendo a reserva
//				Cliente cliente = new Cliente();
//				cliente = new ClienteBO().pesquisarCliente(Integer.parseInt(request.getParameter("nrIdentificador")));
				
				// Obtendo o quarto a ser reservado
				// Precisamos alinhar qual forma usaremos para pesquisar o quarto (nome, codigo, tipo)
//				Quarto quarto = new Quarto();
//				quarto = new QuartoBO().pesquisarQuarto(Integer.parseInt(request.getParameter("cdQuarto"))); 
				
				// Trabalhando com as datas da reserva
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				Date dtSolicitacao = new Date();			
				Date dtEntrada = df.parse(request.getParameter("dtEntrada"));
				Date dtSaida = df.parse(request.getParameter("dtSaida"));				
				
				// Instanciando e preenchendo o obejto Reserva
				Reserva reserva = new Reserva();
				reserva.setDtSolicitacao(dtSolicitacao);
//				reserva.setCliente(cliente);
//				reserva.setTipoQuarto(quarto);
				reserva.setDtEntrada(dtEntrada);
				reserva.setDtSaida(dtSaida);
				reserva.setQtAdulto(Integer.parseInt(request.getParameter("nrQtdAdulto")));
				reserva.setQtCrianca(Integer.parseInt(request.getParameter("nrQtdCrianca")));
				reserva.setQtQuarto(Integer.parseInt(request.getParameter("nrQtdQuarto")));
				reserva.setStatusReserva(true);
				
				new ReservaBO().inserirReserva(reserva);
				
			} catch (Exception e) {
				StringWriter errors = new StringWriter();
				e.printStackTrace(new PrintWriter(errors));
				response.getWriter().print(errors.toString());
			}
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
