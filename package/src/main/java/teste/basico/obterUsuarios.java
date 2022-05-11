package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.usuario;
//SELECT
public class obterUsuarios {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		List<usuario> usuarios = em.
				createQuery("SELECT u FROM usuario u", usuario.class)
				.setMaxResults(6)
				.getResultList();
		for(usuario usuario : usuarios){
		System.out.println("ID: "  + usuario.getId()
		+ " EMAIL: " + usuario.getEmail());	
		}
		
		
		
		em.close();
		emf.close();

	}
}
