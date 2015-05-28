package main;
import java.util.List;

import br.senai.sc.ti20132n1.sa.Dao.CarroDao;
import br.senai.sc.ti20132n1.sa.model.Carro;


public class Main {

	public static void main(String[] args) {
		
		CarroDao carrodao = new CarroDao();
		
		Carro carro = new Carro();
		carro.setAno(2014);
		carro.setDescricao("bla");
		carro.setDirecao("hidraulica");
		carro.setMarca("gol");
		carro.setModel("f");
		carro.setMotor("fr");
		carro.setQuantpassageiros(4);
		carro.setQuantportas(2);
		carro.setValorcarro(458880D);
		carro = carrodao.buscarPorId(3L);
		carrodao.excluir(carro.getId());
		Carro carro2 = carrodao.buscarPorId(4L);
		carro2.setDescricao("blablablabla");
//		List<Carro> carros = carrodao.listar();
//		carrodao.fechar();
//		System.out.println(carros);
//		
	}
	
	
	
	

}
