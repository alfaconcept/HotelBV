package br.com.fiap.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.BO.ClienteBO;
import br.com.fiap.beans.Cliente;

/**
 * Servlet implementation class ServletFuncionario
 */

public class ServletCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("action").equals("login")) {
			try {
				Cliente cliente = new Cliente();
				cliente.setDsEmail(request.getParameter("txtEmail"));
				cliente.setDsSenhaAcesso(request.getParameter("pwdSenha"));
				new ClienteBO().loginCliente(cliente);
				request.setAttribute("user", "We Are Alfa!");
				request.getRequestDispatcher("reserva.jsp").forward(request, response);
			} catch (Exception e) {
				
			}
		}
		
		
		
		doGet(request, response);
	}

}
