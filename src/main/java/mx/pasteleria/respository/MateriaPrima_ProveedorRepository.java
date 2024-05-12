package mx.pasteleria.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.pasteleria.crudRespository.MateriaPrima_ProveedorCrudRepository;
import mx.pasteleria.entity.MateriaPrima_Proveedor;

@Repository
public class MateriaPrima_ProveedorRepository {
	@Autowired
	private MateriaPrima_ProveedorCrudRepository crudRepository;
	
	//Inyectar metodos 
	public Iterable<MateriaPrima_Proveedor> selectAll(){
		return this.crudRepository.findAll();
	}
	
}
