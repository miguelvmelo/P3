package br.upe.devflix.video.servico;

import org.springframework.beans.factory.annotation.Autowired;

import br.upe.devflix.video.modelo.Video;

public class VideoServico implements IVideoServico {

	@Autowired
	private IVideoServico dao;
	
	@Override
	public void adicionar(Video video) {
		
		
	}

}
