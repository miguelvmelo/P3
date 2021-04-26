package br.upe.devflix.categoria.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.upe.devflix.categoria.modelo.Categoria;

@Repository
public interface ICategoriaDAO extends CrudRepository<Categoria, Long>{

	List<Categoria> findByNome(String nome);
	List<Categoria> findByOrdemExibicao( int ordem);
	
}
