package br.upe.devflix.canal.modelo;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.upe.devflix.base.Entidade;


@Entity
@Table(name = "historico_canal")
public class HistoricoCanal extends Entidade{

	

	private String nome;
	private String descricao;
	private String cor;
	@ElementCollection
	private List<String> tags;
	private int ordemExibicao;
	private boolean publica;
	private boolean visivel;
	private boolean bloqueada;

	//Canal
	@ManyToOne
	@JoinColumn(name = "canal_id")
	private Canal canal;
	


	public Canal getCanal() {
		return canal;
	}
	public void setCanal(Canal canal) {
		this.canal = canal;
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
