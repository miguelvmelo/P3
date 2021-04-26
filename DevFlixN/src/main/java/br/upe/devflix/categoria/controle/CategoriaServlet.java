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
		categoria.setVisivel(Boolean.valueOf(req.getParameter("visivel")));

		servico.criar(categoria);

	}

}
