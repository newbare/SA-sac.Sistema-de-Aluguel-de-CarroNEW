package br.senai.sc.ti20132n1.sa.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import br.senai.sc.ti20132n1.sa.model.Carro;



public class CarroDao {
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	public CarroDao(){
		entityManagerFactory = Persistence.createEntityManagerFactory("sacjpadb");		
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	public  void atualizar(Carro carro) {
		entityManager.getTransaction().begin();
		entityManager.merge(carro);
		entityManager.getTransaction().commit();
	}

	public void excluir(Long id) {
		entityManager.getTransaction().begin();
		Carro carro = entityManager.getReference(Carro.class, id);
		entityManager.remove(carro);
		entityManager.getTransaction().commit();
	}

	public Carro buscarPorId(Long id) {
		entityManager.getTransaction().begin();
		Carro carro = entityManager.getReference(Carro.class, id);
		entityManager.getTransaction().commit();
		return carro;
	}

	public void inserir(Carro carro) {
		entityManager.getTransaction().begin();
		entityManager.persist(carro);
		entityManager.getTransaction().commit();
	}
	public List<Carro> listar(){
		entityManager.getTransaction().begin();
		Query query = entityManager.createQuery("From Carro", Carro.class);
		List<Carro> carros = query.getResultList();
		entityManager.getTransaction().commit();
		return carros;
		
		}
	
	
	public void fechar(){
		entityManager.close();
		
		entityManagerFactory.close();
	}
	
}
