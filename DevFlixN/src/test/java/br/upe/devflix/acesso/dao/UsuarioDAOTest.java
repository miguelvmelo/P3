package br.upe.devflix.acesso.dao;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import br.upe.devflix.acesso.modelo.Usuario;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UsuarioDAOTest {
	
	@Autowired
	private UsuarioDAO dao;
	
	@Test
	public void testeIncluirUsuarioSucesso()
	{
		long existentes = dao.count();
		
		Usuario usuario = new Usuario();
		usuario.setNome("Miguel");
		dao.save(usuario);
		
		long existentesApos = dao.count();
		assertThat(existentesApos, is(equalTo(existentes + 1)));
				
		
	}

}
