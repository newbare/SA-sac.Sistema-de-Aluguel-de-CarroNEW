package br.senai.sc.ti20132n1.sa.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.senai.sc.ti20132n1.sa.Dao.CarroDao;
import br.senai.sc.ti20132n1.sa.model.Carro;



@ManagedBean
public class CarroMB {
	
	private Carro carro;
	private List<Carro> carros;
	private CarroDao carroDao;
	
	@PostConstruct
	public void initMB() {
		this.carro = new Carro();
		carroDao = new CarroDao();
	}
	
	public Carro getCarro(){
		return carro;
	}
	
	public Carro setCarro(){
		return carro;
	}
	
	public List<Carro> getCarros(){
		if(carros == null){
			carros = carroDao.listarTodos();
		}
		return carros;
	}
	
	
	
	
	
	
	
	

}
