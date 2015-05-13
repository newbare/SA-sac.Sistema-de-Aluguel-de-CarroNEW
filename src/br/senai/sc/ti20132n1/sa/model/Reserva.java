package br.senai.sc.ti20132n1.sa.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reserva {
	
	@Id
	@GeneratedValue
	private long id;
	private String localDeretirada;
	private String localDevolucao;
	private Date dataDeRetirada;
	private Date dataDeDevolucao;
	private double valortotal;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLocalDeretirada() {
		return localDeretirada;
	}
	public void setLocalDeretirada(String localDeretirada) {
		this.localDeretirada = localDeretirada;
	}
	public String getLocalDevolucao() {
		return localDevolucao;
	}
	public void setLocalDevolucao(String localDevolucao) {
		this.localDevolucao = localDevolucao;
	}
	public Date getDataDeRetirada() {
		return dataDeRetirada;
	}
	public void setDataDeRetirada(Date dataDeRetirada) {
		this.dataDeRetirada = dataDeRetirada;
	}
	public Date getDataDeDevolucao() {
		return dataDeDevolucao;
	}
	public void setDataDeDevolucao(Date dataDeDevolucao) {
		this.dataDeDevolucao = dataDeDevolucao;
	}
	public double getValortotal() {
		return valortotal;
	}
	public void setValortotal(double valortotal) {
		this.valortotal = valortotal;
	}
	
	@Override
	public String toString(){
		return "\nID: " + id + "\nLocal de Retirada: " + "\nLocal de Devolução: " + localDevolucao
				+ "\nData de Retirada: " + dataDeRetirada + "\nData de Devolução: " + dataDeDevolucao
				+ "\nValor Total: " + valortotal;
	}
	

}
