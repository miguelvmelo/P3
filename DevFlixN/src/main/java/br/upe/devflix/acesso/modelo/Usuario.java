package br.upe.devflix.acesso.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.upe.devflix.base.Entidade;
import br.upe.devflix.canal.modelo.Canal;

@Entity
public class Usuario extends Entidade {

	@Column(name = "perfil_acesso")
	@Enumerated(value = EnumType.STRING)
	private PerfilAcesso perfilAcesso;
	private String nome;
	private String email;
	private String senha;
	private boolean bloqueado;

	// AutenticacaoExterna
	@OneToMany(mappedBy = "usuario")
	private List<AutenticacaoExterna> autenticacoes;

	// Notificacao
	@OneToMany(mappedBy = "usuario")
	private List<Notificacao> notificacoes;

	// Perfil
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_perfil", referencedColumnName = "id")
	private Perfil perfil;

	// Canal
	@ManyToMany
	//@JoinTable(name = "usuario_canal", joinColumns = @JoinColumn(name = "usuario_id",referencedColumnName = "id"), 
	//inverseJoinColumns = @JoinColumn(name = "canal_id",referencedColumnName ="id" ))
	private List<Canal> canais;

	public PerfilAcesso getPerfilAcesso() {
		return perfilAcesso;
	}

	public void setPerfilAcesso(PerfilAcesso perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	public List<AutenticacaoExterna> getAutenticacoes() {
		return autenticacoes;
	}

	public void setAutenticacoes(List<AutenticacaoExterna> autenticacoes) {
		this.autenticacoes = autenticacoes;
	}

	public List<Notificacao> getNotificacoes() {
		return notificacoes;
	}

	public void setNotificacoes(List<Notificacao> notificacoes) {
		this.notificacoes = notificacoes;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public List<Canal> getCanais() {
		return canais;
	}

	public void setCanais(List<Canal> canais) {
		this.canais = canais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
