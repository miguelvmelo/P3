package br.upe.devflix.acesso.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.upe.devflix.acesso.dao.IUsuarioDAO;
import br.upe.devflix.acesso.modelo.Usuario;

@Service
public class UsuarioServico implements IUsuarioServico {

	@Autowired
	private IUsuarioDAO dao;

	@Override
	public void incluir(Usuario usuario) {

		validarCamposObrigatorios(usuario);

		List<Usuario> usuarioExistente = dao.findByNome(usuario.getNome());
		if (usuarioExistente != null && usuarioExistente.size() > 0) {

			throw new RuntimeException("Já existe um usuário com esse nome");

		}

		dao.save(usuario);
	}

	@Override
	public void excluir(Long id) {

		if (id == null) {

			throw new RuntimeException("Precisa ser informado o id do usuario");
		}
		if (dao.findById(id).isEmpty()) {

			throw new RuntimeException("Nao existe usuario cadastrado com o id informado");
		}

		dao.deleteById(id);
	}

	private void validarCamposObrigatorios(Usuario usuario) {
		if (usuario == null) {

			throw new RuntimeException("Os dados do usuário precisa ser preenchido");

		}
		if (usuario.getNome() == null || usuario.getNome().isEmpty()) {

			throw new RuntimeException("O nome deve ser preenchido");

		}
		if (usuario.getSenha() == null || usuario.getSenha().isEmpty()) {

			throw new RuntimeException("A senha deve ser preenchido");

		}
		if (usuario.getPerfilAcesso() == null) {

			throw new RuntimeException("O usuário precisa de um perfil de acesso");

		}

	}

}
