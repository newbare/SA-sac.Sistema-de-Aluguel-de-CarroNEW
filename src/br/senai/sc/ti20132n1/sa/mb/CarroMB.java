package br.senai.sc.ti20132n1.sa.mb;

import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;





import br.senai.sc.ti20132n1.sa.dao.CarroDao;
import br.senai.sc.ti20132n1.sa.model.Carro;
import br.senai.ti20132n1.sa.util.UploadImageException;
import br.senai.ti20132n1.sa.util.UploadImageUtil;




@ManagedBean
public class CarroMB {

	private Carro carro;
	private List<Carro> carros;
	private CarroDao carroDao;
	private Part imagem;
	private UploadImageUtil uploadImageUtil;

	@PostConstruct
	public void initMB() {
		this.carro = new Carro();
		carroDao = new CarroDao();
		uploadImageUtil = new UploadImageUtil("img/uploads/");
	}

	
	
	public CarroDao getCarroDao() {
		return carroDao;
	}



	public void setCarroDao(CarroDao carroDao) {
		this.carroDao = carroDao;
	}



	public Part getImagem() {
		return imagem;
	}



	public void setImagem(Part imagem) {
		this.imagem = imagem;
	}



	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}



	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public List<Carro> getCarros() {
		if (carros == null) {
			carros = carroDao.listarTodos(carro);
		}
		return carros;
	}

	public void setCarro(List<Carro> carros) {
		this.carros = carros;
	}

	public String caminhoUpload(String imagem){
		return UploadImageUtil.getCaminhoRelativo(imagem);
	}
	
	public String salvar() {
		String nomeImagem;
		try {
			nomeImagem = UploadImageUtil.salvar(imagem, carro.getImagem());
			carro.setImagem(nomeImagem);
		} catch (UploadImageException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(e.getMessage()));
			e.printStackTrace();
			return "";
		} catch (IOException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Nao foi possivel salvar a imagem."));
			e.printStackTrace();
			return "";
		}
		
		carroDao.salvar(carro);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Carro salvo com sucesso!"));
		return "listarcarros";
	}

	public String excluir(String idParam) {
		Long id = Long.valueOf(idParam);
		
		Carro carroExcluir = carroDao.buscarPorId(id);
		UploadImageUtil.excluir(carroExcluir.getImagem());
		
		carroDao.excluir(id);
		carros = null;
		return "";
	}

	public String editar(String idParam) {
		Long id = Long.valueOf(idParam);
		carro = carroDao.buscarPorId(id);
		return "cadastrocarro";
	}

}
