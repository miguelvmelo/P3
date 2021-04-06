package br.upe.devflix.comentario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.upe.devflix.base.Entidade;


@Entity
public class HistoricoComentario extends Entidade {



	private String descricao;
	private boolean bloqueado;

	//Comentario
	@ManyToOne
	@JoinColumn(name = "id_comentario")
	private Comentario comentario;


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
	
}
