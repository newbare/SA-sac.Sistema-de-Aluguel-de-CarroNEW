package br.senai.sc.ti20132n1.sa.dao;

import java.util.List;




import br.senai.sc.ti20132n1.sa.model.Carro;



public class CarroDao extends DaoImplements<Carro> {
	
	public CarroDao(){
		super(Carro.class);
	}
	
	public void salvar(Carro carro) {
		if (carro.getId() == null){
			save(carro);
		}else{
			update(carro);
		}
	}
	

	public void excluir(Long id) {
		Carro carro = findAllById(id);
		delete(carro);
	}
	
	public List<Carro> listarTodos(Carro carro) {
		return findAll();
	}
	
	public Carro buscarPorId(Long id){
		return findAllById(id);
	}
	
	

	

	
	
}
