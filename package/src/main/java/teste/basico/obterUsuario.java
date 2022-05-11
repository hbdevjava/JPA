package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.usuario;

public class obterUsuario {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		usuario usuario = em.find(usuario.class,5L);// 
		System.out.println(usuario.getNome());
		System.out.println(usuario.getEmail());

		em.close();
		emf.close();

	}

}
