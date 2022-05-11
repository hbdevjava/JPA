package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.usuario;
//INSERT 
public class novoUsuario {
	public static void main(String[] args) {
		
				
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
	 EntityManager em = emf.createEntityManager();
	 
	usuario  novoUsuario = new usuario("XXXX","xxx@gmail.com");
	

	 em.getTransaction().begin();
	 em.persist(novoUsuario);
	
	 em.getTransaction().commit();
	 
	 
	 /*System.out.println("O id gerado foi: " + novoUsuario.getId());
	 System.out.println("O email gerado foi: " + novoUsuario.getEmail());
	 System.out.println("O nome gerado foi: " + novoUsuario.getNome());*/
	 
	 
	 em.close();
	 emf.close();
	 
	 
	 








	}


}