package services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.MontagemDeComputador;

public class GerenciadorBD {
	private EntityManager em;

	public GerenciadorBD() {
		setEm(Persistence.createEntityManagerFactory("ProjetoRian").createEntityManager());
		//em.getTransaction().begin();
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public void salvar(Object obj) {
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		//em.close();
	}

	public void removerPC(MontagemDeComputador pc) {
		em.getTransaction().begin();
		//MontagemDeComputador pcf = em.find(MontagemDeComputador.class, pc);
		em.remove(pc);
		em.getTransaction().commit();
		//em.close();

	}

	public void fecharTransicao() {
		em.close();
	}

	/*public MontagemDeComputador iniciarEdicaorPC(MontagemDeComputador pc) {
		em.getTransaction().begin();
		return null;
	}*/

	public void editar(Object o) {
		em.getTransaction().begin();
		em.merge(o);
		em.getTransaction().commit();
		//em.close();
	}

	public List list(Class classe) {
		em.getTransaction().begin();
		Query query = em.createQuery("from " + classe.getName());
		em.getTransaction().commit();
		//em.close();
		return query.getResultList();
	}

}
