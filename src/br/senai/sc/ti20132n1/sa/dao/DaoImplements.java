package br.senai.sc.ti20132n1.sa.dao;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import br.senai.ti20132n1.sa.util.JPAUtil;

public class DaoImplements<T> implements Dao<T>  {
	
	private static Logger logger;
	private Class<T> klass;
	public EntityManager em;
	
	public DaoImplements(Class<T> klass) {
		this.klass = klass;
		checkIntitymanageFactory();
	}
	
	private void checkIntitymanageFactory() {
		if (JPAUtil.entityManagerFactory == null) {
			JPAUtil.createEntityManagerFactory();
		}
	}
	
	private void checkEntityManager() throws Exception {
		if (em == null || !em.isOpen()) {
			em = JPAUtil.getEntityManager();
		}
	}

	@Override
	public void save(T t) {
		try {
			checkEntityManager();
			this.em.getTransaction().begin();
			this.em.persist(t);
			this.em.getTransaction().commit();
		} catch (Exception e) {
			this.em.getTransaction().rollback();
			logger.severe(e.getMessage());
		} finally {
			this.em.close();
			this.em = null;
		}
	}

	@Override
	public void update(T t) {
		try {
			checkEntityManager();
			this.em.getTransaction().begin();
			this.em.merge(t);
			this.em.getTransaction().commit();
		} catch (Exception e) {
			this.em.getTransaction().rollback();
			logger.severe(e.getMessage());
		} finally {
			this.em.close();
			this.em = null;
		}
		
	}

	@Override
	public void delete(T t) {
		try {
			checkEntityManager();
			this.em.getTransaction().begin();
			this.em.remove(t);
			this.em.getTransaction().commit();
		} catch (Exception e) {
			this.em.getTransaction().rollback();
			logger.severe(e.getMessage());
		} finally {
			this.em.close();
			this.em = null;
		}
	}

	@Override
	public void deleteAll(List<T> t) {
		try {
			checkEntityManager();
			this.em.getTransaction().begin();
			for (T obj : t) {
				this.em.remove(obj);
				this.em.getTransaction().commit();
			}
		} catch (Exception e) {
			this.em.getTransaction().rollback();
			logger.severe(e.getMessage());
		} finally {
			this.em.close();
			this.em = null;
		}
	}

	@Override
	public T findAllById(Long id) {
		T result = null;
		try {
			checkEntityManager();
			result = this.em.find(klass, id);
		} catch (Exception e) {
			logger.severe(e.getMessage());
		} finally {
			this.em.close();
			this.em = null;
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		List<T> result = null;
		try {
			checkEntityManager();
			//TODO: Fazer busca generic
			result = this.em.createNamedQuery("").getResultList();
		} catch (Exception e) {
			logger.severe(e.getMessage());
		} finally {
			this.em.close();
			this.em = null;
		}
		return result;
	}

}
