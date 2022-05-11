package br.com.fiap.dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.fiap.model.Setup;

public class SetupDao {
	
	@Inject
	@RequestScoped
	private EntityManager manager;
	
	public void create(Setup setup) {
		manager.getTransaction().begin();
		manager.persist(setup);
		manager.getTransaction().commit();
		
		manager.clear();
		manager.close();

	}
	
	public List<Setup> listAll() {
//		TypedQuery<Setup> query = manager.createQuery("SELECT s FROM Setup s", Setup.class);
//		return query.getResultList();
		
		return manager.createQuery("SELECT s FROM Setup s", Setup.class).getResultList();
	}
	
	public void remove(Setup setup) {
		manager.getTransaction().begin();
		manager.remove(setup);
		manager.getTransaction().commit();
		
		manager.close();
	}

	public void update(Setup setup) {
		manager.getTransaction().begin();
		manager.merge(setup);
		manager.getTransaction().commit();
		
		manager.close();
	}
}
