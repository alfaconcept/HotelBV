package br.com.fiap.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.BO.FuncionarioBO;
import br.com.fiap.beans.Funcionario;
import br.com.fiap.conexao.ConnectionFactory;

/**
 * Servlet implementation class ServletFuncionario
 */
public class ServletFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletFuncionario() {
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
		if (request.getParameter("action").equals("logar")) {
			Connection conn = null;
			try {
				conn = ConnectionFactory.controlarInstancia().getConnection();
				Funcionario funcionario = new Funcionario();
				funcionario.setCdPessoa(Integer.parseInt(request.getParameter("nrCodPessoa")));
				funcionario.setDsSenhaAcesso(request.getParameter("pwdSenha"));
				funcionario = new FuncionarioBO().pesquisarFuncionario(funcionario, conn);
				
				HttpSession session = request.getSession();
				session.setAttribute("funcionario", funcionario);
				
				request.getRequestDispatcher("ResultadoFuncionario.jsp").forward(request, response);
			} catch (Exception e) {
				StringWriter errors = new StringWriter();
				e.printStackTrace(new PrintWriter(errors));
				response.getWriter().print(errors.toString());
			}
		}
	}

}
