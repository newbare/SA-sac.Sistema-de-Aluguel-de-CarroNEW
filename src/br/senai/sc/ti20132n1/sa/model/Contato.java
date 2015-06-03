package br.senai.sc.ti20132n1.sa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "contato")
@NamedQueries({ @NamedQuery(name = "Contato.findAll", query = "SELECT p FROM Contato p") })
public class Contato {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private long id;
	private String nome;
	private String email;
	private String telefone;
	private String menssagem;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getMenssagem() {
		return menssagem;
	}
	public void setMenssagem(String menssagem) {
		this.menssagem = menssagem;
	}
	
	
	

}
