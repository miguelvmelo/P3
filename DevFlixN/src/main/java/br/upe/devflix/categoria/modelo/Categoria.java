package br.upe.devflix.categoria.modelo;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.upe.devflix.acesso.modelo.Notificacao;
import br.upe.devflix.base.Entidade;
import br.upe.devflix.canal.modelo.Canal;
import br.upe.devflix.comentario.modelo.Comentario;
import br.upe.devflix.video.modelo.Video;

@Entity
public class Categoria extends Entidade {

	private String nome;
	private String descricao;
	private String cor;
	@ElementCollection
	private List<String> tags;
	private Integer ordemExibicao;
	private Boolean publica;
	private Boolean visivel;
	private Boolean bloqueada;

	// Notificacao
	@OneToMany(mappedBy = "categoria")
	private List<Notificacao> notificacao;

	// Video
	@OneToMany(mappedBy = "categoria")
	private List<Video> videos;

	// Comentario
	@OneToMany(mappedBy = "categoria")
	private List<Comentario> comentarios;

	// Historico Categoria
	@OneToMany(mappedBy = "categoria")
	private List<HistoricoCategoria> historico;

	// Canal
	@OneToOne
	@JoinColumn(name = "canal_id", referencedColumnName = "id")
	private Canal canal;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public Integer getOrdemExibicao() {
		return ordemExibicao;
	}

	public void setOrdemExibicao(Integer ordemExibicao) {
		this.ordemExibicao = ordemExibicao;
	}

	public Boolean getPublica() {
		return publica;
	}

	public void setPublica(Boolean publica) {
		this.publica = publica;
	}

	public Boolean getVisivel() {
		return visivel;
	}

	public void setVisivel(Boolean visivel) {
		this.visivel = visivel;
	}

	public Boolean getBloqueada() {
		return bloqueada;
	}

	public void setBloqueada(Boolean bloqueada) {
		this.bloqueada = bloqueada;
	}

	public List<Notificacao> getNotificacao() {
		return notificacao;
	}

	public void setNotificacao(List<Notificacao> notificacao) {
		this.notificacao = notificacao;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public List<HistoricoCategoria> getHistorico() {
		return historico;
	}

	public void setHistorico(List<HistoricoCategoria> historico) {
		this.historico = historico;
	}

	public Canal getCanal() {
		return canal;
	}

	public void setCanal(Canal canal) {
		this.canal = canal;
	}

}
