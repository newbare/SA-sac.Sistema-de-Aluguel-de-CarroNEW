package br.senai.sc.ti20132n1.sa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Cliente {
	
	@Id
	@GeneratedValue
	private long id;
	private String nome;
	private String nomeusuario;
	private String senha;
	private String cpf;
	private String telefone;
	private String email;
	private String dataNascimento;
	private Double numeroHabilitacao;
	private String endereco;
	private String cidade;
	private String estado;
	
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Double getNumeroHabilitacao() {
		return numeroHabilitacao;
	}
	public void setNumeroHabilitacao(Double numeroHabilitacao) {
		this.numeroHabilitacao = numeroHabilitacao;
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
	public String getNomeusuario() {
		return nomeusuario;
	}
	public void setNomeusuario(String nomeusuario) {
		this.nomeusuario = nomeusuario;
	}
	@Override
	public String toString(){
		return "\nId: " + id + "\nNome: " + nome + "\nSenha: " + senha 
				+ "\nCPF: " + "\nTelefone: " + "\nE-mail: " 
				+ "\nData de nascimento: " + dataNascimento + "\nNumero da Habilitação: " + numeroHabilitacao     
				+ "\nCidade: " + cidade + "\nEstado: " + estado;
	}
	

}
