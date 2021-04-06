package br.upe.devflix.canal;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import br.upe.devflix.acesso.Usuario;
import br.upe.devflix.base.Entidade;


@Entity
public class Canal extends Entidade {

	

	private String nome;
	private String descricao;
	private String cor;
	private List<String> tags;
	private int ordemExibicao;
	private boolean publica;
	private boolean visivel;
	private boolean bloqueada;
	private Usuario usuario;
	private List<HistoricoCanal> historico;
	
	//Usuario	
	@ManyToMany(mappedBy = "canais")
	private List<Usuario> usuarios;
	
	
	//Historico Canal
	@ManyToOne
	@JoinColumn(name = "id_historicoCanal")
	private HistoricoCanal historico1;
	
	
	
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
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<HistoricoCanal> getHistorico() {
		return historico;
	}
	public void setHistorico(List<HistoricoCanal> historico) {
		this.historico = historico;
	}
	
	
}