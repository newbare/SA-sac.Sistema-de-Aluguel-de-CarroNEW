package br.senai.sc.ti20132n1.sa.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.type.descriptor.java.UUIDTypeDescriptor.ToStringTransformer;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue
	private long id;
	private String nome;
	private String senha;
	private String cpf;
	private String telefone;
	private String email;
	private Date dataNascimento;
	private int numeroHabilitacao;
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
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getNumeroHabilitacao() {
		return numeroHabilitacao;
	}
	public void setNumeroHabilitacao(int numeroHabilitacao) {
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
	@Override
	public String toString(){
		return "\nId: " + id + "\nNome: " + nome + "\nSenha: " + senha 
				+ "\nCPF: " + "\nTelefone: " + "\nE-mail: " 
				+ "\nData de nascimento: " + dataNascimento + "\nNumero da Habilitação: " + numeroHabilitacao  
				+ "\nCidade: " + cidade + "\nEstado: " + estado;
	}
	

}
