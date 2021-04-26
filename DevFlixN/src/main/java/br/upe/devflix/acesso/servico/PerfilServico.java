package br.upe.devflix.acesso.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.upe.devflix.acesso.dao.IPerfilDAO;
import br.upe.devflix.acesso.modelo.Perfil;

@Service
public class PerfilServico implements IPerfilServico {

	@Autowired
	private IPerfilDAO dao;
	
	public void criarPerfil (Perfil perfil) {
		
		
	}
	
}
