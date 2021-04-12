package br.upe.devflix.categoria.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.upe.devflix.acesso.modelo.Usuario;

@Repository
public interface CategoriaDAO extends CrudRepository<Usuario, Long>{

}
