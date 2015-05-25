package br.senai.sc.ti20132n1.sa.Dao;

import br.senai.sc.ti20132n1.sa.model.Contato;

public class ContatoDao extends Dao{
	
	public void salvar(Contato contato) {
		getEntityManager().merge(contato);
	}

}
