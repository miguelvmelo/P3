package br.upe.devflix.video;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.upe.devflix.acesso.Notificacao;
import br.upe.devflix.base.Entidade;
import br.upe.devflix.categoria.Categoria;
import br.upe.devflix.comentario.Comentario;


@Entity
public class Video extends Entidade {



	
	private String titulo;	
	private String url;
	private String descricao;
	private List<String> tags;
	private int ordemExibicao;
	private boolean publico;
	private boolean visivel;
	private boolean bloqueado;
	@OneToMany(mappedBy = "video")
	private List<MetaDado> metadados;
	private List<HistoricoVideo> historico;
	//private Categoria categoria1;
	private int id;

	//Notificacao
	@OneToMany(mappedBy = "video")
	private List<Notificacao>notificacao;

	//Categoria
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;

	//Comentario
	@OneToMany(mappedBy = "video")
	private List<Comentario> comentarios;

	//Historico Video
	@ManyToOne
	@JoinColumn(name = "id_historicoVideo")
	private HistoricoVideo historico1;

	




	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	public boolean isPublico() {
		return publico;
	}

	public void setPublico(boolean publico) {
		this.publico = publico;
	}

	public boolean isVisivel() {
		return visivel;
	}

	public void setVisivel(boolean visivel) {
		this.visivel = visivel;
	}

	public boolean isBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	public List<MetaDado> getMetadados() {
		return metadados;
	}

	public void setMetadados(List<MetaDado> metadados) {
		this.metadados = metadados;
	}

	public List<HistoricoVideo> getHistorico() {
		return historico;
	}

	public void setHistorico(List<HistoricoVideo> historico) {
		this.historico = historico;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	
	
}