package br.senai.sc.ti20132n1.sa.mb;

import java.util.List;




import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;

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

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public List<Carro> getCarros() {
		if (carros == null) {
			carros = carroDao.listarTodos();
		}
		return carros;
	}

	public void setCarro(List<Carro> carros) {
		this.carros = carros;
	}

	public String salvar() {
		CarroDao dao = new CarroDao();
		dao.salvar(carro);
		carro = new Carro();
		return "";
	}

	public String excluir(String idParam) {
		Long id = Long.valueOf(idParam);
		carroDao.excluir(id);
		carros = null;
		return "";
	}

	public String editar(String idParam) {
		Long id = Long.valueOf(idParam);
		carro = carroDao.buscarPorId(id);
		return "formcarro";
	}

}
