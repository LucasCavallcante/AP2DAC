package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import entidades.Delito;
import util.JPAUtil;

public class DelitoDao {
	
	public static void salvar(Delito d) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(d);
		em.getTransaction().commit();
		em.close();
	}
	public static void editar(Delito d) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.merge(d);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void excluir(Delito d) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		d = em.find(Delito.class, d.getId());
		em.remove(d);
		em.getTransaction().commit();
		em.close();
		
		
		}
	public static List<Delito> listarDelitos() {
	       EntityManager entityManager = JPAUtil.criarEntityManager();
	       TypedQuery<Delito> query = entityManager.createQuery("SELECT d FROM Delito d JOIN FETCH d.vitima JOIN FETCH d.suspeito", Delito.class);
	        return query.getResultList();
	    }
}
