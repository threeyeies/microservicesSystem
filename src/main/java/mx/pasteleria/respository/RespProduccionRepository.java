package mx.pasteleria.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import mx.pasteleria.crudRespository.RespProduccionCrudRepository;
import mx.pasteleria.entity.RespProduccion;

@Repository
public class RespProduccionRepository {
	@Autowired
	private RespProduccionCrudRepository crudRepository;
	
	//Inyectar metodos 
	public Iterable<RespProduccion> selectAll(){
		return this.crudRepository.findAll();
	}
}
