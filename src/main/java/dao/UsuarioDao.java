package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import entidades.Usuario;
import util.JPAUtil;

public class UsuarioDao {
	
	public static void salvar(Usuario u) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void editar(Usuario u) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.merge(u);
		em.getTransaction().commit();
		em.close();
	}
	public static void excluir(Usuario u) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		u = em.find(Usuario.class, u.getId());
		em.remove(u);
		em.getTransaction().commit();
		em.close();
	}
	
	public static List<Usuario> listarTodos(){
		EntityManager em = JPAUtil.criarEntityManager();
		Query q = em.createQuery("select e from Usuario e");
		List<Usuario> lista = q.getResultList();
		em.close();
		return lista;
	}
	
	public boolean autenticarLogin(Usuario usuario) {
	    EntityManager em = JPAUtil.criarEntityManager();
	    Query q = em.createQuery ("SELECT COUNT(u) FROM Usuario u WHERE u.login = :login AND u.senha = :senha", Long.class);
	    q.setParameter("login", usuario.getLogin());
	    q.setParameter("senha", usuario.getSenha());
	    Long count = (Long) q.getSingleResult();
	    em.close();
	    return count == 1;
	}

}
