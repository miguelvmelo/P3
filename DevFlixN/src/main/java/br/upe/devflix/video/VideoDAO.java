package br.upe.devflix.video;

import org.springframework.data.repository.CrudRepository;

import br.upe.devflix.acesso.Usuario;

public interface VideoDAO extends CrudRepository<Usuario, Long> {

}
