package br.senai.sc.ti20132n1.sa.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.senai.sc.ti20132n1.sa.model.Administrador;
import br.senai.sc.ti20132n1.sa.model.Cliente;
import br.senai.sc.ti20132n1.sa.model.Reserva;

public class AdministradorDao {

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	public AdministradorDao() {
		entityManagerFactory = Persistence
				.createEntityManagerFactory("sacjpadb");
		entityManager = entityManagerFactory.createEntityManager();
	}

	public void atualizar(Administrador administrador) {
		entityManager.getTransaction().begin();
		entityManager.merge(administrador);
		entityManager.getTransaction().commit();
	}

	public void excluir(Long id) {
		entityManager.getTransaction().begin();
		Administrador administrador = entityManager.getReference(
				Administrador.class, id);
		entityManager.remove(administrador);
		entityManager.getTransaction().commit();
	}
	
	public Administrador buscarPorId(Long id) {
		entityManager.getTransaction().begin();
		Administrador administrador = entityManager.getReference(Administrador.class, id);
		entityManager.getTransaction().commit();
		return administrador;
	}
	
	public void inserir(Administrador administrador) {
		entityManager.getTransaction().begin();
		entityManager.persist(administrador);
		entityManager.getTransaction().commit();
	}
	
	public List<Administrador> listar() {
		entityManager.getTransaction().begin();
		Query query = entityManager.createQuery("From Administrador", Administrador.class);
		List<Administrador> administrador = query.getResultList();
		entityManager.getTransaction().commit();
		return administrador;

	}
	
	public void fechar(){
		entityManager.close();
		
		entityManagerFactory.close();
	}
}
