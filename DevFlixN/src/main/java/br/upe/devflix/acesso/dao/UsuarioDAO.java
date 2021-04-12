package br.upe.devflix.acesso.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.upe.devflix.acesso.modelo.Usuario;

@Repository
public interface UsuarioDAO extends CrudRepository<Usuario, Long> {
	
	
	

}

