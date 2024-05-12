package mx.pasteleria.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.pasteleria.crudRespository.OrdProd_ProdCrudRepository;
import mx.pasteleria.entity.OrdProd_Prod;

@Repository
public class OrdProd_ProdRepository {
	@Autowired
	private OrdProd_ProdCrudRepository crudRepository;
	
	//Inyectar metodos 
	public Iterable<OrdProd_Prod> selectAll(){
		return this.crudRepository.findAll();
	}
}
