package br.senai.sc.ti20132n1.sa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "administrador")
@NamedQueries({ @NamedQuery(name = "Administrador.findAll", query = "SELECT p FROM Administrador p") })
public class Administrador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private long id;
	private String nome;
	private Date dataNascimento;
	private String cpf;
	private String email;
	private String endereco;
	private String cidade;
	private String estado;
	private String cargo;
	
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
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		return "Administrador [id=" + id + ", nome=" + nome
				+ ", dataNascimento=" + dataNascimento + ", cpf=" + cpf
				+ ", email=" + email + ", endereco=" + endereco + ", cidade="
				+ cidade + ", estado=" + estado + ", cargo=" + cargo + "]";
	}
	
	
	

}
