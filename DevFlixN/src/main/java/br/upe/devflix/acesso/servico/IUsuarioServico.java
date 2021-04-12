package br.upe.devflix.acesso.servico;

import br.upe.devflix.acesso.modelo.Usuario;

public interface IUsuarioServico {
	
	void incluir(Usuario usuario);
	
	void excluir(Long id);

}
