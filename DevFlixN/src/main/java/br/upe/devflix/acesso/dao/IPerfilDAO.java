package br.upe.devflix.acesso.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.upe.devflix.acesso.modelo.Usuario;

@Repository
public interface IPerfilDAO extends CrudRepository<Usuario, Long> {

}
