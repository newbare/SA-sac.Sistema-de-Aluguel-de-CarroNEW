package br.senai.sc.ti20132n1.sa.dao;

import java.util.List;

public interface Dao<T> {

	public void save(T t);
	
	public void update(T t);
	
	public void delete(T t);
	
	public void deleteAll(List<T> t);
	
	public T findAllById(Long id);
	
	public List<T> findAll();
}
