package br.upe.devflix.acesso.servico;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import br.upe.devflix.acesso.dao.IUsuarioDAO;
import br.upe.devflix.acesso.modelo.Perfil;
import br.upe.devflix.acesso.modelo.PerfilAcesso;
import br.upe.devflix.acesso.modelo.Usuario;

@RunWith(MockitoJUnitRunner.class)
public class UsuarioServicoTest {

	@Mock
	private IUsuarioDAO dao;

	@InjectMocks
	private UsuarioServico servico;

	@Test
	public void testeIncluirUsuarioSucesso() {

		Usuario usuario = new Usuario();

		usuario.setNome("Miguel");
		usuario.setSenha("nao sei");
		usuario.setPerfilAcesso(PerfilAcesso.ADMINISTRADOR);

		servico.incluir(usuario);

		//verify(dao, times(1)).findByNome(usuario.getNome());
		//verify(dao, times(1)).save(usuario);
	}

}
