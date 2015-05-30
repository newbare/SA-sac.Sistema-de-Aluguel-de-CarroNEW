package br.senai.sc.ti20132n1.sa.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.senai.sc.ti20132n1.sa.model.Reserva;

public class ReservaDao extends Dao{
	
	public void salvar(Reserva reserva) {
		getEntityManager().merge(reserva);
	}
	
	public void excluir(Long id) {
		Reserva reserva = getEntityManager().getReference(Reserva.class, id);
		getEntityManager().remove(reserva);
	}
	
	public Reserva buscarPorId(Long id) {
		return getEntityManager().find(Reserva.class, id);
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Reserva> listarTodos() {
		Query query = getEntityManager().createQuery("From Reserva",Reserva.class);
		return query.getResultList();
	}
	
	

	

}
