package br.upe.devflix.comentario.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.upe.devflix.comentario.dao.IComentarioDAO;
import br.upe.devflix.comentario.modelo.Comentario;

@Service
public class ComentarioServico implements IComentarioServico{

	@Autowired
	private IComentarioDAO dao;
	
	public void criar( Comentario comentario) {
	
	if (comentario == null) {

		throw new RuntimeException("Precisa escrever algum comentario");

	}

	if (comentario.getDescricao() == null || comentario.getDescricao().isEmpty()) {

		throw new RuntimeException("Não foi digitado nada");

	}
	comentario.setBloqueado(false);
	}
}
