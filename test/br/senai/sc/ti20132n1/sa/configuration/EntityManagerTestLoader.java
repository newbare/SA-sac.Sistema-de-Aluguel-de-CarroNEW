package br.senai.sc.ti20132n1.sa.configuration;

import br.senai.ti20132n1.sa.util.JPAUtil;



public class EntityManagerTestLoader {
	
	private static final String SA_sac_Sistema_de_Aluguel_de_Carro_TEST = "SA-sac.Sistema-de-Aluguel-de-CarroTest";

	public static void load() {
		JPAUtil.createEntityManagerFactory(SA_sac_Sistema_de_Aluguel_de_Carro_TEST);
	}

}
