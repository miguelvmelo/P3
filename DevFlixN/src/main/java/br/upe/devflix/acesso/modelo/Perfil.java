package br.upe.devflix.acesso.modelo;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import br.upe.devflix.base.Entidade;

@Entity
public class Perfil extends Entidade {

	private String descricao;
	private String visualizacao;
	private byte[] foto;

	// Usuario
	@OneToOne(mappedBy = "perfil")
	private Usuario usuario;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getVisualizacao() {
		return visualizacao;
	}

	public void setVisualizacao(String visualizacao) {
		this.visualizacao = visualizacao;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
