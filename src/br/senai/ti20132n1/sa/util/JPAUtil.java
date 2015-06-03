package br.senai.ti20132n1.sa.util;

import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletRequest;

public class JPAUtil {

	private static final String  SA_sac_Sistema_de_Aluguel_de_Carro_TEST = "SA-sac.Sistema-de-Aluguel-de-CarroTest";
	private static final String  SA_sac_Sistema_de_Aluguel_de_Carro = "SA-sac.Sistema-de-Aluguel-de-Carro";
	private static final String ENTITY_MANAGER = "ENTITY_MANAGER";
	public static EntityManagerFactory entityManagerFactory;

	public static EntityManager getEntityManager() throws Exception{
		String managerFactoryInUse = entityManagerFactory.getProperties().get(
				"hibernate.ejb.persistenceUnitName").toString();
		
		if (SA_sac_Sistema_de_Aluguel_de_Carro_TEST.equalsIgnoreCase(managerFactoryInUse)) {
			return createEntityManager();
		} else if(SA_sac_Sistema_de_Aluguel_de_Carro.equalsIgnoreCase(managerFactoryInUse)) {
			ServletRequest request = (ServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
			return (EntityManager) request.getAttribute(ENTITY_MANAGER);
		} else {
			throw new Exception("Não foi possível localizar o entityManagerFactory em uso.");
		}
		
		
	}
	
	static EntityManager createEntityManager() {
		return createEntityManager(null);
	}

	static EntityManager createEntityManager(ServletRequest request) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		if (request != null) {
			request.setAttribute(ENTITY_MANAGER, entityManager);
			return entityManager;
		}
		return entityManager;
	}
	
	public static void createEntityManagerFactory(String persistenceUnit) {
		if (entityManagerFactory == null) {
			entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnit);		
		}
	}

	public static void createEntityManagerFactory() {
		createEntityManagerFactory("SA-sac.Sistema-de-Aluguel-de-Carro");		
	}

	public static void entityManagerFactoryClose() {
		entityManagerFactory.close();
	}

}
