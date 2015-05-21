package br.senai.sc.ti20132n1.sa.Dao;

import javax.persistence.EntityManager;

import br.senai.ti20132n1.sa.util.JPAUtil;

public class Dao {

	protected EntityManager getEntityManager() {
		return JPAUtil.getEntityManager();

	}
}
