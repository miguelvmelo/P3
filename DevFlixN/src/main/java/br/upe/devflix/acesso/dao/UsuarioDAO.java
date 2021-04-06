package br.upe.devflix.acesso.dao;

import org.springframework.data.repository.CrudRepository;

import br.upe.devflix.acesso.modelo.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Long> {
	
	
	

}

