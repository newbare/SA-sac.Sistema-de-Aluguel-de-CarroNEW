package br.senai.sc.ti20132n1.sa.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import br.senai.sc.ti20132n1.sa.model.Carro;



public class CarroDao extends Dao {
	
	public void salvar(Carro carro) {
		getEntityManager().merge(carro);
	}
	

	public void excluir(Long id) {
		Carro carro = getEntityManager().getReference(Carro.class, id);
		getEntityManager().remove(carro);
	}

	public Carro buscarPorId(Long id) {
		return getEntityManager().find(Carro.class, id);
	}

	
	@SuppressWarnings("unchecked")
	public List<Carro> listarTodos() {
		Query query = getEntityManager().createQuery("From Carro",Carro.class);
		return query.getResultList();
	}
	
	
	
	
}
