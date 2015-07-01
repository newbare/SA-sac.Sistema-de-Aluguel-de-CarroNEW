package br.senai.sc.ti20132n1.sa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Carro {
	
	@Id
	@GeneratedValue
	private Long id;
	private String marca;
	private String model;
	private int ano;
	private Double valorcarro;
	private int quantpassageiros;
	private String motor;
	private int quantportas;
	private String direcao;
	private String imagem;
	private String placa;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Double getValorcarro() {
		return valorcarro;
	}
	public void setValorcarro(Double valorcarro) {
		this.valorcarro = valorcarro;
	}
	public int getQuantpassageiros() {
		return quantpassageiros;
	}
	public void setQuantpassageiros(int quantpassageiros) {
		this.quantpassageiros = quantpassageiros;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public int getQuantportas() {
		return quantportas;
	}
	public void setQuantportas(int quantportas) {
		this.quantportas = quantportas;
	}
	public String getDirecao() {
		return direcao;
	}
	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagen) {
		this.imagem = imagen;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	@Override
	public String toString() {
		return "\nID:" + id + "\nMarca:" + marca + "\nModelo:" + model
				+ "\nAno=" + ano + "\nValor do carro:" + valorcarro
				+ "\nQuantidade de passageiros:" + quantpassageiros + "\nMotor=" + motor
				+ "\n Quantidade de portas:" + quantportas
				+ "\nDirecao=" + direcao + "\n";
	}
	
	
	
}
