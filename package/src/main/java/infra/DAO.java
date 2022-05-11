package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

// DAO DATA ACCESS OBJECT
public class DAO<E> {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		} catch (Exception e) {
			// logar -> log4j
		}

	}

	public DAO() {
		this(null);
	}

	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}

	public DAO<E> AbrirT() {
		em.getTransaction().begin();
		return this;
	}

	public DAO<E> FecharT() {
		em.getTransaction().commit();
		return this;
	}

	public DAO<E> Incluir(E entidade) {
		em.persist(entidade);
		return this;
	}
	
	public DAO<E> Delete(E entidade) {
		em.persist(entidade);
		return this;
	}

	public DAO<E> IncluirAtomico(E entidade) {
		return this.AbrirT().Incluir(entidade).FecharT();
	}
	
	public E obterPorId(Object id) {
		return em.find(classe, id);
	}

	public List<E> ObterTodos() {
		return this.ObterTodos(10, 0);

	}

	public List<E> ObterTodos(int qtde, int deslocamento) {
		if (classe == null) {
			throw new UnsupportedOperationException("Classe Nula");
		}
		String jpql = "select e from" + classe.getName() + " e";// TODA CONSULTA EM jpql PRECISA TER ELIAS
		TypedQuery<E> query = em.createNamedQuery(jpql, classe);
		query.setMaxResults(qtde);
		query.setFirstResult(deslocamento);
		return query.getResultList();
	}
	
	public void fechar() {
		em.close();
	}

}
