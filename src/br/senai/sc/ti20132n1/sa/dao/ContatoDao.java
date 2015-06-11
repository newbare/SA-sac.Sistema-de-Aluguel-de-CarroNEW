package br.senai.sc.ti20132n1.sa.dao;

import java.util.List;

import br.senai.sc.ti20132n1.sa.model.Contato;

public class ContatoDao extends DaoImplements<Contato> {

	public ContatoDao() {
		super(Contato.class);
	}

	public void salvar(Contato contato) {
		save(contato);
	}

	public void excluir(Long id) {
		Contato contato = findAllById(id);
		delete(contato);
	}

	public Contato buscarPorId(Long id) {
		return findAllById(id);
	}

	public List<Contato> listarTodos(){
		return findAll();
	}

}
