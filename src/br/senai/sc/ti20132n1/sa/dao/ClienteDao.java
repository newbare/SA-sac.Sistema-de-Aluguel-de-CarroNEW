package br.senai.sc.ti20132n1.sa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.senai.sc.ti20132n1.sa.model.Administrador;
import br.senai.sc.ti20132n1.sa.model.Cliente;


public class ClienteDao extends DaoImplements<Cliente>{

	public ClienteDao(){
		super(Cliente.class);
	}

	
	public void salvar(Cliente cliente) {
		save(cliente);
	}
	

	public void excluir(Long id) {
		Cliente cliente = findAllById(id);
		delete(cliente);
	}

	public Cliente buscarPorId(Long id) {
		return findAllById(id);
	}

	

	
	public List<Cliente> listarTodos() {
		return findAll();
	}
	
	

}
