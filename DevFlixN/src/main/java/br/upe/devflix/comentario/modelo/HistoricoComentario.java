package br.upe.devflix.comentario.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.upe.devflix.base.Entidade;


@Entity
@Table(name = "historico_comentario")
public class HistoricoComentario extends Entidade {



	private String descricao;
	private boolean bloqueado;

	//Comentario
	@ManyToOne
	@JoinColumn(name = "comentario_id")
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
