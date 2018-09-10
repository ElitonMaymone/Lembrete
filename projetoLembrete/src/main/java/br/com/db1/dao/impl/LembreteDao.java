package br.com.db1.dao.impl;


import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import br.com.db1.dao.DAO;
import br.com.db1.model.Lembrete;

public class LembreteDao implements DAO<Lembrete>{

	private EntityManager manager;
	
	@Inject
	public LembreteDao(EntityManager manager) {
		this.manager = manager;
	}
	
	public List<Lembrete> findAll() {
		return manager.createQuery("from lembrete").getResultList();
	}


	public boolean save(Lembrete lembrete) {
		manager.persist(lembrete);
		return true;
	}
	
	public Lembrete findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
