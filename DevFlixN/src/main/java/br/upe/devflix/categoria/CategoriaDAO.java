package br.upe.devflix.categoria;

import org.springframework.data.repository.CrudRepository;

import br.upe.devflix.acesso.Usuario;

public interface CategoriaDAO extends CrudRepository<Usuario, Long>{

}
