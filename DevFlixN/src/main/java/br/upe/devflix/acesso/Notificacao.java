package br.upe.devflix.acesso;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.upe.devflix.base.Entidade;
import br.upe.devflix.categoria.Categoria;
import br.upe.devflix.comentario.Comentario;
import br.upe.devflix.video.Video;


@Entity
public class Notificacao extends Entidade {



	private Usuario notificador;
	private Usuario notificado;
	@ManyToOne
	@JoinColumn(name = "id_video")
	private Video video;
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	private Comentario comentario;
	private String descricao;
	//private SituacaoNotificacao situacao;

	//Usuario
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;


	//Video
	@ManyToOne
	@JoinColumn(name = "id_video")
	private Video video1;




	public Usuario getNotificador() {
		return notificador;
	}
	public void setNotificador(Usuario notificador) {
		this.notificador = notificador;
	}
	public Usuario getNotificado() {
		return notificado;
	}
	public void setNotificado(Usuario notificado) {
		this.notificado = notificado;
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
	public Comentario getComentario() {
		return comentario;
	}
	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/*public SituacaoNotificacao getSituacao() {
		return situacao;
	}
	public void setSituacao(SituacaoNotificacao situacao) {
		this.situacao = situacao;
	}
	 */

}
