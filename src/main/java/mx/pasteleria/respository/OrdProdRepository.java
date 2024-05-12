package mx.pasteleria.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.pasteleria.crudRespository.OrdProdCrudRepository;
import mx.pasteleria.entity.OrdProd;

@Repository
public class OrdProdRepository {
	@Autowired
	private OrdProdCrudRepository crudRepository;
	
	//Inyectar metodos 
	public Iterable<OrdProd> selectAll(){
		return this.crudRepository.findAll();
	}
}
