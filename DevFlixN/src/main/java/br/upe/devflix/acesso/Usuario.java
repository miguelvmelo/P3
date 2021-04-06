package br.upe.devflix.acesso;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.upe.devflix.base.Entidade;
import br.upe.devflix.canal.Canal;


@Entity
public class Usuario extends Entidade {

	
	//private int id;
	private String nome;
	private String email;
	private String senha;
	private boolean bloqueado;
	
	//private perfilAcesso perfil;
	@OneToMany(mappedBy = "usuario")
	private List<AutenticacaoExterna> autenticacoes;
	@OneToMany(mappedBy = "usuario")
	private List<Notificacao> notificacoes;




	//Perfil
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "id_perfil",referencedColumnName = "id_perfil")
	private Perfil perfil;	




	//Canal
	@ManyToMany
	@JoinTable(
			name = "usuario_perfil",
			joinColumns = @JoinColumn (name = "id_usuario"),
			inverseJoinColumns = @JoinColumn(name = "id_perfil")
			)
	private List<Canal> canais;


	/*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}*/
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
