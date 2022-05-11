package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.usuario;
//UPDATE
public class AlterarUsuario1 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		usuario usuario = em.find(usuario.class, 6L);
		usuario.setNome("HB2");
		//usuario.setEmail("bia@gmail.com");
		
		em.merge(usuario);
		//em.detach(usuario); TIRA O OBJETO DO ESTADO GERENCIADO OU SEJA
		// FAZ O UPDATE EM UM OUTRO MOMENTO;
		em.getTransaction().commit();
		
		em.close();
		emf.close();


	}

}
