package br.upe.devflix.canal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.upe.devflix.canal.modelo.Canal;

@Repository
public interface ICanalDAO extends CrudRepository<Canal, Long> {

}
