package br.com.fiap.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.BO.ClienteBO;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;

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
				int nrIdentificador = Integer.parseInt(request.getParameter("nrIdentificador"));
				new ClienteBO().deletarCliente(nrIdentificador);
				request.getRequestDispatcher("clientes.jsp");
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
			try {
				// Instancia e preenche o endereco do cliente
				Endereco endereco = new Endereco();
				endereco.setRua(request.getParameter("txtRua"));
				endereco.setNumero(Integer.parseInt(request.getParameter("nrNumero")));
				endereco.setCep(request.getParameter("txtCep"));
				endereco.setComplemento(request.getParameter("txtComplemento"));
				endereco.setBairro(request.getParameter("txtBairro"));
				
				Cliente cliente = new Cliente();
				cliente.setnmPessoa(request.getParameter("txtNome"));
				cliente.setCpf(Integer.parseInt(request.getParameter("nrCpf")));
				
			} catch (Exception e) {
				// TODO: handle exception
			}
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
