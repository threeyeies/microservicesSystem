package mx.pasteleria.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.pasteleria.crudRespository.RespCompraCrudRepository;
import mx.pasteleria.entity.RespCompra;

@Repository
public class RespCompraRepository {
	@Autowired
	private RespCompraCrudRepository crudRepository;
	
	//Inyectar metodos 
	public Iterable<RespCompra> selectAll(){
		return this.crudRepository.findAll();
	}
}
