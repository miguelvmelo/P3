package br.upe.devflix.categoria.dao;

import org.springframework.data.repository.CrudRepository;

import br.upe.devflix.acesso.modelo.Usuario;

public interface CategoriaDAO extends CrudRepository<Usuario, Long>{

}
