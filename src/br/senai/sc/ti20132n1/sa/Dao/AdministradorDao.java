package br.senai.sc.ti20132n1.sa.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;
import br.senai.sc.ti20132n1.sa.model.Administrador;


public class AdministradorDao extends Dao{

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	public AdministradorDao() {
		entityManagerFactory = Persistence
				.createEntityManagerFactory("sacjpadb");
		entityManager = entityManagerFactory.createEntityManager();
	}

	
	public void salvar(Administrador administrador) {
		getEntityManager().merge(administrador);
	}
	
	public void excluir(Long id) {
		Administrador administrador = getEntityManager().getReference(Administrador.class, id);
		getEntityManager().remove(administrador);
	}
	
	public Administrador buscarPorId(Long id) {
		return getEntityManager().find(Administrador.class, id);
	}
	
	
	
	@SuppressWarnings("unchecked")
	public List<Administrador> listarTodos() {
		Query query = getEntityManager().createQuery("From Administrador",Administrador.class);
		return query.getResultList();
	}
	
	public void fechar(){
		entityManager.close();
		
		entityManagerFactory.close();
	}
}
