package br.senai.sc.ti20132n1.sa.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.senai.sc.ti20132n1.sa.model.Cliente;

public class ClienteDao extends Dao{

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	public ClienteDao() {
		entityManagerFactory = Persistence
				.createEntityManagerFactory("sacjpadb");
		entityManager = entityManagerFactory.createEntityManager();
	}

	public void salvar(Cliente cliente) {
		getEntityManager().merge(cliente);
	}
	

	public void excluir(Long id) {
		entityManager.getTransaction().begin();
		Cliente cliente = entityManager.getReference(Cliente.class, id);
		entityManager.remove(cliente);
		entityManager.getTransaction().commit();
	}

	public Cliente buscarPorId(Long id) {
		entityManager.getTransaction().begin();
		Cliente cliente = entityManager.getReference(Cliente.class, id);
		entityManager.getTransaction().commit();
		return cliente;
	}

	

	public List<Cliente> listar() {
		entityManager.getTransaction().begin();
		Query query = entityManager.createQuery("From Cliente", Cliente.class);
		List<Cliente> cliente = query.getResultList();
		entityManager.getTransaction().commit();
		return cliente;

	}
	
	public void fechar(){
		entityManager.close();
		
		entityManagerFactory.close();
	}

}
