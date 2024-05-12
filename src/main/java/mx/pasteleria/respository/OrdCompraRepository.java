package mx.pasteleria.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.pasteleria.crudRespository.OrdCompraCrudRepository;
import mx.pasteleria.entity.OrdCompra;

@Repository
public class OrdCompraRepository {
	@Autowired
	private OrdCompraCrudRepository crudRepository;
	
	//Inyectar metodos 
	public Iterable<OrdCompra> selectAll(){
		return this.crudRepository.findAll();
	}
}
