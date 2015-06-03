package br.senai.sc.ti20132n1.sa.dao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.runner.RunWith;

import br.senai.sc.ti20132n1.sa.Dao.CarroDao;
import br.senai.sc.ti20132n1.sa.configuration.JUnitRunner;
import br.senai.sc.ti20132n1.sa.model.Carro;
import br.senai.ti20132n1.sa.util.JPAUtil;

@RunWith(JUnitRunner.class)
public class CarroDaoTest {
	
	private static CarroDao dao;
	
	@AfterClass
	public static void finish() {
		JPAUtil.entityManagerFactoryClose();
	}
	
	@Before
	public void initTest() {
		dao = new CarroDao();
	}
	
	@After
	public void finishTest() {
		dao = null;
	}
	
	public void testCadastraNovoCarro(){
		Carro c = new Carro();
		c.setMarca("BMW");
		c.setAno(2015);
		c.setValorcarro(500.00);
		c.setQuantpassageiros(5);
		c.setMotor("3.0");
		c.setQuantportas(4);
		c.setDirecao("hidraulica");
		c.setImagen("Imagem.jpg");
		c.setPlaca("TED2016");
		
		dao.salvar(c);
		assertTrue(c.getId() != null);
		
	}

}
