package br.upe.devflix.categoria.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.upe.devflix.categoria.dao.ICategoriaDAO;
import br.upe.devflix.categoria.modelo.Categoria;

@Service
public class CategoriaServico implements ICategoriaServico {

	@Autowired
	private ICategoriaDAO dao;

	@Override
	public void criar(Categoria categoria) {

		validarCamposObrigatoriosPadrao(categoria);

		List<Categoria> categoriaExistente = dao.findByNome(categoria.getNome());
		if (categoriaExistente != null && categoriaExistente.size() > 0) {

			throw new RuntimeException("Já existe uma categoria com esse nome");

		}

		List<Categoria> ordemExibicaoExistente = dao.findByOrdemExibicao(categoria.getOrdemExibicao());
		if (ordemExibicaoExistente != null & ordemExibicaoExistente.size() > 0) {

			throw new RuntimeException("Já existe uma ordem");

		}
		categoria.setBloqueada(false);
		categoria.setVisivel(true);

		dao.save(categoria);
	}

	@Override
	public void excluir(Long id) {

	}

	private void validarCamposObrigatoriosPadrao(Categoria categoria) {
		if (categoria == null) {

			throw new RuntimeException("Os dados do usuário precisa ser preenchido");

		}

		if (categoria.getNome() == null || categoria.getNome().isEmpty()) {

			throw new RuntimeException("O nome deve ser preenchido");

		}
		if (categoria.getDescricao() == null || categoria.getDescricao().isEmpty()) {

			throw new RuntimeException("A descrição deve ser preenchido");

		}
		if (categoria.getCor() == null || categoria.getCor().isEmpty()) {

			throw new RuntimeException("Uma cor deve ser informada");

		}
		if (categoria.getVisivel() == null) {

			throw new RuntimeException("A visibilidade da categoria deve ser informada");

		}
	}
}
