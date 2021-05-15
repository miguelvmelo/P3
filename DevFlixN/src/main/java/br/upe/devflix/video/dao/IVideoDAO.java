package br.upe.devflix.video.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.upe.devflix.acesso.modelo.Usuario;
import br.upe.devflix.video.modelo.Video;

@Repository
public interface IVideoDAO extends CrudRepository<Video, Long> {

	List<Video> findByCategoria(Long idCategoria);
	
}
