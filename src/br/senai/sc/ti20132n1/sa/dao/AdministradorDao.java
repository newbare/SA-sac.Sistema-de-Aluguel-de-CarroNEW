package br.senai.sc.ti20132n1.sa.dao;



import java.util.List;

import br.senai.sc.ti20132n1.sa.model.Administrador;


public class AdministradorDao extends DaoImplements<Administrador> {

	public AdministradorDao() {
		super(Administrador.class);
	}

	public void salvar(Administrador administrador) {
		save(administrador);
	}

	public void excluir(Long id) {
		Administrador administrador = findAllById(id);
		delete(administrador);
	}

	public List<Administrador> listarTodos() {
		return findAll();
	}

	public Administrador buscarPorId(Long id) {
		return findAllById(id);
	}

	

}
