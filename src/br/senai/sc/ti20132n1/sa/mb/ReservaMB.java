package br.senai.sc.ti20132n1.sa.mb;

import java.util.List;

import javax.annotation.PostConstruct;

import br.senai.sc.ti20132n1.sa.dao.ReservaDao;
import br.senai.sc.ti20132n1.sa.model.Reserva;

public class ReservaMB {
	
	private Reserva reserva;
	private List<Reserva> reservas;
	private ReservaDao reservaDao;
	
	@PostConstruct
	public void initMB(){
		this.reserva = new Reserva();
		reservaDao = new ReservaDao();
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public List<Reserva> getReservas() {
		if (reserva == null){
			reservas = reservaDao.listarTodos();
		}
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	
	public String salvar(){
		reservaDao.salvar(reserva);
		return "listareserva?faces-redirect=true";
	}
	
	public String excluir(String idParam){
		Long id = Long.valueOf(idParam);
		reservaDao.excluir(id);
		return "formreserva";
	}
	
	public String editar(String idParam){
		Long id = Long.valueOf(idParam);
		reservaDao.buscarPorId(id);
		return "formreserva";
	}
	
	

}
