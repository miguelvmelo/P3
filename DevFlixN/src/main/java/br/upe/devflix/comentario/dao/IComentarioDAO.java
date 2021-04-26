package br.upe.devflix.comentario.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.upe.devflix.comentario.modelo.Comentario;

@Repository
public interface IComentarioDAO extends CrudRepository<Comentario, Long> {

}
