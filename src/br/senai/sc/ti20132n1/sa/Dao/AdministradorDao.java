package br.senai.sc.ti20132n1.sa.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;

import br.senai.sc.ti20132n1.sa.model.Administrador;
import br.senai.sc.ti20132n1.sa.model.Carro;


public class AdministradorDao extends DaoImplements<Administrador>{


	public AdministradorDao(){
		super(Administrador.class);
	}
	
	public void salvar(Administrador administrador) {
		if (administrador.getId() != null){
			save(administrador);
		}else{
			update(administrador);
		}
	}
	
	public void excluir(Long id) {
		Administrador administrador = findAllById(id);
		delete(administrador);
	}
	
	public List<Administrador> listarTodos(Administrador administrador) {
		return findAll();
	}
	
	public Administrador buscarPorId(Long id){
		return findAllById(id);
	}
	
	
//	@SuppressWarnings("unchecked")
//	public List<Administrador> listarTodos() {
//		Query query = getEntityManager().createQuery("From Administrador",Administrador.class);
//		return query.getResultList();
//	}
	
	
}
