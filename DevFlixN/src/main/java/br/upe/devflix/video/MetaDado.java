package br.upe.devflix.video;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.upe.devflix.base.Entidade;

@Entity
public class MetaDado extends Entidade {



	private String chave;
	private String valor;

	//Video
	@ManyToOne
	@JoinColumn(name = "id_video")
	private Video video;


	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
}
