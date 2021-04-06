package br.upe.devflix.acesso.modelo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import br.upe.devflix.base.Entidade;
import br.upe.devflix.categoria.modelo.Categoria;
import br.upe.devflix.comentario.modelo.Comentario;
import br.upe.devflix.video.Video;

@Entity
public class Notificacao extends Entidade {

	@Enumerated(value = EnumType.STRING)
	private SituacaoNotificacao situacao;
	private String descricao;

	@OneToOne
	@JoinColumn(name = "notificador_id")
	private Usuario notificador;

	@OneToOne
	@JoinColumn(name = "notificado_id")
	private Usuario notificado;

	// Video
	@ManyToOne
	@JoinColumn(name = "video_id")
	private Video video;

	// Comentario
	@ManyToOne
	@JoinColumn(name = "comentario_id")
	private Comentario comentario;

	// Categoria
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;

	// private SituacaoNotificacao situacao;

	// Usuario
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	public Usuario getNotificador() {
		return notificador;
	}

	public void setNotificador(Usuario notificador) {
		this.notificador = notificador;
	}

	public Usuario getNotificado() {
		return notificado;
	}

	public void setNotificado(Usuario notificado) {
		this.notificado = notificado;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public SituacaoNotificacao getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoNotificacao situacao) {
		this.situacao = situacao;
	}

	public Comentario getComentario() {
		return comentario;
	}

	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/*
	 * public SituacaoNotificacao getSituacao() { return situacao; } public void
	 * setSituacao(SituacaoNotificacao situacao) { this.situacao = situacao; }
	 */

}
