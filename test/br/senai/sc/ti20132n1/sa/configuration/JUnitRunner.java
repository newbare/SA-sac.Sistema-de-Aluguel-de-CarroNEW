package br.senai.sc.ti20132n1.sa.configuration;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class JUnitRunner extends BlockJUnit4ClassRunner{
	
	public JUnitRunner(Class<?> klass) throws InitializationError {
		super(klass);
		EntityManagerTestLoader.load();
	}

}
