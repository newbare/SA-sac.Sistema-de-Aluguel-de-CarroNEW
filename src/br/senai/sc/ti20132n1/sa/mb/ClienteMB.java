package br.senai.sc.ti20132n1.sa.mb;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.annotation.PostConstruct;



import br.senai.sc.ti20132n1.sa.dao.ClienteDao;
import br.senai.sc.ti20132n1.sa.model.Cliente;
@ManagedBean
public class ClienteMB {
	
	private Cliente cliente;
	private List<Cliente> clientes;
	private ClienteDao clienteDao;
	
	@PostConstruct
	public void initMB(){
		this.cliente = new Cliente();
		clienteDao = new ClienteDao();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getClientes() {
		if(clientes == null){
			clientes = clienteDao.listarTodos();
		}
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public String salvar(){
		clienteDao.salvar(cliente);
		return "listacliente?faces-redirect=true";
	}
	
	public String excluir(String idParam){
		Long id = Long.valueOf(idParam);
		clienteDao.excluir(id);
		return "formcliente";
	}
	
	public String editar(String idParam){
		Long id = Long.valueOf(idParam);
		cliente = clienteDao.buscarPorId(id);
		return "cadastrocliente";
	}
	
	

}
