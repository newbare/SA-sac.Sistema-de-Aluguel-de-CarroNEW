package br.senai.sc.ti20132n1.sa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.senai.sc.ti20132n1.sa.model.Reserva;

public class ReservaDao extends DaoImplements<Reserva> {

	public ReservaDao() {
		super(Reserva.class);
	}

	public void salvar(Reserva reserva) {
		save(reserva);
	}

	public void excluir(Long id) {
		Reserva reserva = findAllById(id);
		delete(reserva);
	}

	public Reserva buscarPorId(Long id) {
		return findAllById(id);
	}

	public List<Reserva> listarTodos() {
		return findAll();
	}

}
