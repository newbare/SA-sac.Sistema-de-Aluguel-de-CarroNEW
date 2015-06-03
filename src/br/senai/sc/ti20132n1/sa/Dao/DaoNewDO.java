package br.senai.sc.ti20132n1.sa.Dao;

import java.util.List;

public interface DaoNewDO<T> {

	public void save(T t);
	
	public void update(T t);
	
	public void delete(T t);
	
	public void deleteAll(List<T> t);
	
	public T findAllById(Integer id);
	
	public List<T> findAll();

}
