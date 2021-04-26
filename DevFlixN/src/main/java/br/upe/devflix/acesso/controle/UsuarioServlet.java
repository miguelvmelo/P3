package br.upe.devflix.acesso.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import br.upe.devflix.acesso.modelo.Usuario;
import br.upe.devflix.acesso.servico.IUsuarioServico;

@WebServlet(urlPatterns = {"/Usuario"})
public class UsuarioServlet extends HttpServlet{

	@Autowired
	private IUsuarioServico servico;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nome = req.getParameter("Nome");
		String senha = req.getParameter("Senha");
		//PerfilAcesso perfilAcesso = req.getParameterNames();
		
		Usuario usuario = new Usuario(nome,senha);
		
		servico.incluir(usuario);
	}
	
}
