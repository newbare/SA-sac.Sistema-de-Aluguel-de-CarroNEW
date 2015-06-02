package br.senai.sc.ti20132n1.sa.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.senai.sc.ti20132n1.sa.Dao.ContatoDao;
import br.senai.sc.ti20132n1.sa.model.Contato;

@ManagedBean
public class contatoMB {

	private Contato contato;
	private List<Contato> contatos;
	private ContatoDao contatoDao;

	@PostConstruct
	public void initMB(){
		this.contato = new Contato();
		contatoDao = new ContatoDao();
	}
	
	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public List<Contato> getContatos() {
		if (contatos == null){
			contatos = contatoDao.listarTodos();
		}
		return contatos;
	}

	public void setContato(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public String salvar() {
		contatoDao.salvar(contato);
		return "listacontato?faces-redirect=true";
	}

	public String excluir(String idParam) {
		Long id = Long.valueOf(idParam);
		contatoDao.excluir(id);
		contatos = null;
		return "";
	}

	public String editar(String idParam) {
		Long id = Long.valueOf(idParam);
		contatoDao.buscarPorId(id);
		return "contatos";
	}

	
}
