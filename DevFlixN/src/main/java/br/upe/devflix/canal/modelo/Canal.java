package br.upe.devflix.canal.modelo;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.upe.devflix.acesso.modelo.Usuario;
import br.upe.devflix.base.Entidade;
import br.upe.devflix.categoria.modelo.Categoria;


@Entity
public class Canal extends Entidade {

	

	private String nome;
	private String descricao;
	private String cor;
	@ElementCollection
	private List<String> tags;
	private int ordemExibicao;
	private boolean publica;
	private boolean visivel;
	private boolean bloqueada;
	
	
	
	//Usuario	
	@ManyToMany(mappedBy = "canais")
	private List<Usuario> usuarios;
	
	
	//Historico Canal
	@OneToMany(mappedBy = "canal")
	private List<HistoricoCanal> historico;
	
	//Categoria
	@OneToOne(mappedBy = "canal")
	private Categoria categoria;
	
	
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public List<HistoricoCanal> getHistorico() {
		return historico;
	}
	public void setHistorico(List<HistoricoCanal> historico) {
		this.historico = historico;
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
