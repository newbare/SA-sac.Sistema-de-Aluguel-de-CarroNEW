package br.senai.sc.ti20132n1.sa.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.senai.sc.ti20132n1.sa.model.Cliente;


public class ClienteDao extends Dao{



	public void salvar(Cliente cliente) {
		getEntityManager().merge(cliente);
	}
	

	public void excluir(Long id) {
		Cliente cliente= getEntityManager().getReference(Cliente.class, id);
		getEntityManager().remove(cliente);
	}

	public Cliente buscarPorId(Long id) {
		return getEntityManager().find(Cliente.class, id);
	}

	

	@SuppressWarnings("unchecked")
	public List<Cliente> listarTodos() {
		Query query = getEntityManager().createQuery("From Cliente",Cliente.class);
		return query.getResultList();
	}
	
	

}
