package br.senai.sc.ti20132n1.sa.Dao;

import java.util.List;

import javax.persistence.Query;

import br.senai.sc.ti20132n1.sa.model.Carro;
import br.senai.sc.ti20132n1.sa.model.Contato;

public class ContatoDao extends Dao{
	
	public void salvar(Contato contato) throws Exception {
		getEntityManager().merge(contato);
	}
	
	public void excluir(Long id) throws Exception {
		Contato contato = getEntityManager().getReference(Contato.class, id);
		getEntityManager().remove(contato);
	}
	
	public Contato buscarPorId(Long id) throws Exception {
		return getEntityManager().find(Contato.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Contato> listarTodos() throws Exception {
		Query query = getEntityManager().createQuery("From Contato",Contato.class);
		return query.getResultList();
	}

}
