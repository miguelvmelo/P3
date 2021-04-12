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
public class Categoria extends Entidade{


	private int id;
	private String nome;
	private String descricao;
	private String cor;
	@ElementCollection
	private List<String> tags;
	private int ordemExibicao;
	private boolean publica;
	private boolean visivel;
	private boolean bloqueada;
	

	//Notificacao
	@OneToMany(mappedBy = "categoria")
	private List<Notificacao>notificacao;

	//Video
	@OneToMany(mappedBy = "categoria")
	private List<Video> videos;

	//Comentario
	@OneToMany(mappedBy = "categoria")
	private List<Comentario> comentarios;
	
	//Historico Categoria
	@OneToMany(mappedBy = "categoria")
	private List<HistoricoCategoria> historico;
	
	//Canal
	@OneToOne
	@JoinColumn(name = "canal_id", referencedColumnName = "id")
	private Canal canal;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int getOrdemExibicao() {
		return ordemExibicao;
	}
	public void setOrdemExibicao(int ordemExibicao) {
		this.ordemExibicao = ordemExibicao;
	}
	public boolean isPublica() {
		return publica;
	}
	public void setPublica(boolean publica) {
		this.publica = publica;
	}
	public boolean isVisivel() {
		return visivel;
	}
	public void setVisivel(boolean visivel) {
		this.visivel = visivel;
	}
	public boolean isBloqueada() {
		return bloqueada;
	}
	public void setBloqueada(boolean bloqueada) {
		this.bloqueada = bloqueada;
	}

	
}
