package br.upe.devflix.acesso;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/usuario" )
public class UsuarioServlet extends HttpServlet {


	//private ControleUsuario controle;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nome = req.getParameter("nome");
		String cpf = req.getParameter("cpf");
		
		//controle.cadastrar(nome, cpf);
		
	}
	
}
