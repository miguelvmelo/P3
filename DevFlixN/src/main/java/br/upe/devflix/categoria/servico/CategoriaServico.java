package br.upe.devflix.categoria.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.upe.devflix.categoria.dao.ICategoriaDAO;
import br.upe.devflix.categoria.modelo.Categoria;
import br.upe.devflix.video.dao.IVideoDAO;
import br.upe.devflix.video.modelo.Video;

@Service
public class CategoriaServico implements ICategoriaServico {

	@Autowired
	private ICategoriaDAO dao;
	
	@Autowired
	private IVideoDAO daoVideo;

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
	public void excluir(Long  id) {
		
		if (id == null) {

			throw new RuntimeException("Precisa ser informado o id da categoria");
		}
		
		Categoria categoriaSelecionada = dao.findById(id).get();
		
		if (categoriaSelecionada == null) {

			throw new RuntimeException("Nao existe uma categoria cadastrada com o id informado");
		}
		
		List<Video> videos = daoVideo.findByCategoria(id);
		
		if(videos != null && !videos.isEmpty() ) {

			throw new RuntimeException("Remova os vídeos da categoria antes de excluir");
		}
		
		dao.deleteById(id);
	}
	
	@Override
	public void alterar(Categoria categoria) {
		
		List<Categoria> categoriaExistente = dao.findByNome(categoria.getNome());
		if (categoriaExistente == null && categoriaExistente.size() < 0) {

			throw new RuntimeException("Não existe uma categoria com esse nome");

		}
		
		validarCamposObrigatoriosPadrao(categoria);
		categoria.setBloqueada(false);
		categoria.setVisivel(true);
		
		dao.save(categoria);
		
	}
	
	private void validarCamposObrigatoriosPadrao(Categoria categoria) {
		if (categoria == null) {

			throw new RuntimeException("Os dados da categoria precisa ser preenchido");

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
