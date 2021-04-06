package br.upe.devflix.comentario.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.upe.devflix.acesso.modelo.Notificacao;
import br.upe.devflix.base.Entidade;
import br.upe.devflix.categoria.modelo.Categoria;
import br.upe.devflix.video.Video;

@Entity
public class Comentario extends Entidade {

	private String descricao;
	private boolean bloqueado;

	// Historico
	@OneToMany(mappedBy = "comentario")
	private List<HistoricoComentario> historicos;

	// Video
	@ManyToOne
	@JoinColumn(name = "video_id")
	private Video video;

	// Categoria
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;

	// Notificacao
	@OneToMany(mappedBy = "comentario")
	private List<Notificacao> notificacao;

	public List<HistoricoComentario> getHistoricos() {
		return historicos;
	}

	public void setHistoricos(List<HistoricoComentario> historicos) {
		this.historicos = historicos;
	}

	public List<Notificacao> getNotificacao() {
		return notificacao;
	}

	public void setNotificacao(List<Notificacao> notificacao) {
		this.notificacao = notificacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	public List<HistoricoComentario> getHistorico() {
		return historicos;
	}

	public void setHistorico(List<HistoricoComentario> historico) {
		this.historicos = historico;
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

}
