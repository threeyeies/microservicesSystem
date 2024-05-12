package mx.pasteleria.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.pasteleria.crudRespository.ProveedorCrudRepository;
import mx.pasteleria.entity.Proveedor;

@Repository
public class ProveedorRepository {
	@Autowired
	private ProveedorCrudRepository crudRepository;
	
	//Inyectar metodos 
	public Iterable<Proveedor> selectAll(){
		return this.crudRepository.findAll();
	}
}
