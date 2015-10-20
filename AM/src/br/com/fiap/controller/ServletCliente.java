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
		
		if (request.getParameter("action").equals("pesquisar")) {
			try {
				int nrIdentificador = Integer.parseInt(request.getParameter("nrIdentificador"));
				Cliente cliente = new Cliente();
				cliente = new ClienteBO().pesquisarCliente(nrIdentificador);
				request.setAttribute("cliente", cliente);
				request.getRequestDispatcher("dadosCliente.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (request.getParameter("action").equals("deletar")){
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("action").equals("cadastrar")) {
			
		} else if (request.getParameter("action").equals("alterar")) {
			
		} else {
			try {
				Cliente cliente = new Cliente();
				cliente.setDsEmail(request.getParameter("txtEmail"));
				cliente.setDsSenhaAcesso(request.getParameter("pwdSenha"));
				String nmUser = new ClienteBO().loginCliente(cliente);
				request.setAttribute("user", nmUser);
				request.getRequestDispatcher("reserva.jsp").forward(request, response);
			} catch (Exception e) {
				
			}
		}
		
		
		
		doGet(request, response);
	}

}
