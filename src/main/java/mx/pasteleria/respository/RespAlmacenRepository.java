package mx.pasteleria.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.pasteleria.crudRespository.RespAlmacenCrudRepository;
import mx.pasteleria.entity.RespAlmacen;


@Repository
public class RespAlmacenRepository {
	@Autowired
	private RespAlmacenCrudRepository crudRepository;
	
	//Inyectar metodos 
	public Iterable<RespAlmacen> selectAll(){
		return this.crudRepository.findAll();
	}
}
