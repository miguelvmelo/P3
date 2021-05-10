package br.upe.devflix.categoria.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import br.upe.devflix.categoria.modelo.Categoria;
import br.upe.devflix.categoria.servico.ICategoriaServico;

@WebServlet(urlPatterns = { "/categorias" })
public class CategoriaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Autowired
	private ICategoriaServico servico;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Categoria categoria = new Categoria();

		categoria.setNome(req.getParameter("nome"));
		categoria.setDescricao(req.getParameter("descricao"));
		categoria.setCor(req.getParameter("cor"));
		categoria.setOrdemExibicao(1);
		categoria.setVisivel(Boolean.valueOf(req.getParameter("visivel")));
		categoria.setPublica(true);

		String mensagem = ("Categoria criada com sucesso");
		try {
			servico.criar(categoria);
		} catch (Exception e) {
			mensagem = e.getMessage();
		}
		resp.getOutputStream().print(mensagem);	
		

	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Categoria categoria = new Categoria();

		categoria.setNome(req.getParameter("nome"));
		categoria.setDescricao(req.getParameter("descricao"));
		categoria.setCor(req.getParameter("cor"));
		categoria.setOrdemExibicao(1);
		categoria.setVisivel(Boolean.valueOf(req.getParameter("visivel")));
		categoria.setPublica(true);
		
		String mensagem = ("Categoria alterada com sucesso");
		try {
			servico.alterar(categoria);
		} catch (Exception e) {
			mensagem = e.getMessage();
		}
		resp.getOutputStream().print(mensagem);		
		
	}

}
