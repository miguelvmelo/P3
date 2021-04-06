package br.upe.devflix.comentario;

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

import br.upe.devflix.base.Entidade;
import br.upe.devflix.categoria.Categoria;
import br.upe.devflix.video.Video;

@Entity
public class Comentario extends Entidade {



	private String descricao;
	private boolean bloqueado;
	@OneToMany(mappedBy = "comentario")
	private List<HistoricoComentario> historico;
	@ManyToOne
	@JoinColumn(name = "id_video")
	private Video video;
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;






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
	public List<HistoricoComentario> getHistorico() {
		return historico;
	}
	public void setHistorico(List<HistoricoComentario> historico) {
		this.historico = historico;
	}
	public Video getVideo() {
		return video;
	}
	public void setVideo(Video video) {
		this.video = video;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


}

