package br.upe.devflix.acesso;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_perfil")
	private int id;
	private String descricao;
	private String visualizacao;
	private byte[] foto;
	private Usuario usuario;


	//Usuario
	@OneToOne(mappedBy = "perfil")	
	private Usuario usuario1;


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
