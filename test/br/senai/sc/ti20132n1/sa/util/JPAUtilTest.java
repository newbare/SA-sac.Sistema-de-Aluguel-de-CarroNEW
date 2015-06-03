package br.senai.sc.ti20132n1.sa.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.senai.sc.ti20132n1.sa.configuration.JUnitRunner;
import br.senai.ti20132n1.sa.util.JPAUtil;



@RunWith(JUnitRunner.class)
public class JPAUtilTest {
	
	@Test
	public void testJPAUtilNotNull() {
		assertNotNull(new JPAUtil());
	}
	
	@Test
	public void testLoadEntityManagerFactory() {
		assertEquals("SA-sac.Sistema-de-Aluguel-de-CarroTest", 
				JPAUtil.entityManagerFactory.getProperties().get(
						"hibernate.ejb.persistenceUnitName").toString());
	}

}
