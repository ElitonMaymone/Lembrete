package br.com.db1.dao.impl;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.db1.dao.DAO;
import br.com.db1.model.Lembrete;

public class LembreteDao implements DAO<Lembrete> {
	
	
	private EntityManager manager;
	
	@Inject
	public LembreteDao(EntityManager manager){
		this.manager = manager;
	}
	
	public List<Lembrete> findAll() {
		Query query = manager.createQuery("from lembrete");
		return (List<Lembrete>) query.getResultList();
		
	}

	public Lembrete findById(Integer id) {
		Query query = manager.createQuery("from lembrete where id= :Pid");
		query.setParameter("Pid", id);
		return (Lembrete) query.getSingleResult();
	}

	public boolean save(Lembrete lembrete) {
		manager.persist(lembrete);
		return false;
	}

	public boolean delete(Integer id) {
		Lembrete lembrete = findById(id);
		manager.remove(id);
		return false;
	}

	
}