package br.upe.devflix.acesso.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.upe.devflix.acesso.modelo.Usuario;

@Repository
public interface IUsuarioDAO extends CrudRepository<Usuario, Long> {
	
	List<Usuario> findByNome(String nome);
	

}

