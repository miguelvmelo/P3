package br.upe.devflix.categoria.servico;

import br.upe.devflix.categoria.modelo.Categoria;

public interface ICategoriaServico {

	void criar(Categoria categoria);

	void excluir(Long id);
	
	void alterar(Categoria categoria);

}
