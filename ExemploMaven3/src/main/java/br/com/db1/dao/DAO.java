package br.com.db1.dao;

import java.util.List;

public interface DAO<T> {
		List<T> findAll();

		T findById(Long id);


		boolean save(T t);

		boolean delete(Long id);

}
