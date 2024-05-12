package mx.pasteleria.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.pasteleria.crudRespository.ProdCrudRepository;
import mx.pasteleria.entity.Prod;

@Repository
public class ProdRepository {
	@Autowired
	private ProdCrudRepository crudRepository;
	
	//Inyectar metodos 
	public Iterable<Prod> selectAll(){
		return this.crudRepository.findAll();
	}
}
