package br.senai.sc.ti20132n1.sa.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.senai.sc.ti20132n1.sa.model.Cliente;
import br.senai.sc.ti20132n1.sa.model.Reserva;

public class ReservaDao {
	
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	public ReservaDao(){
		entityManagerFactory = Persistence.createEntityManagerFactory("sacjpadb");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	public void atualizar(Reserva reserva) {
		entityManager.getTransaction().begin();
		entityManager.merge(reserva);
		entityManager.getTransaction().commit();
	}
	
	public void excluir(Long id) {
		entityManager.getTransaction().begin();
		Reserva reserva = entityManager.getReference(Reserva.class, id);
		entityManager.remove(reserva);
		entityManager.getTransaction().commit();
	}
	
	public Reserva buscarPorId(Long id) {
		entityManager.getTransaction().begin();
        Reserva reserva = entityManager.getReference(Reserva.class, id);
		entityManager.getTransaction().commit();
		return reserva;
	}
	
	public void inserir(Reserva reserva) {
		entityManager.getTransaction().begin();
		entityManager.persist(reserva);
		entityManager.getTransaction().commit();
	}
	
	public List<Reserva> listar() {
		entityManager.getTransaction().begin();
		Query query = entityManager.createQuery("From Cliente", Cliente.class);
		List<Reserva> reserva = query.getResultList();
		entityManager.getTransaction().commit();
		return reserva;

	}
	
	public void fechar(){
		entityManager.close();
		
		entityManagerFactory.close();
	}
	

}
