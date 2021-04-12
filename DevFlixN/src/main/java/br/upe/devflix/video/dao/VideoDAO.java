package br.upe.devflix.video.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.upe.devflix.acesso.modelo.Usuario;

@Repository
public interface VideoDAO extends CrudRepository<Usuario, Long> {

}
