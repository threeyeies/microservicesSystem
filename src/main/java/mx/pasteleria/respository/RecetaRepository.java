package mx.pasteleria.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.pasteleria.crudRespository.RecetaCrudRepository;
import mx.pasteleria.entity.Receta;

@Repository
public class RecetaRepository {
	@Autowired
	private RecetaCrudRepository crudRepository;
	
	//Inyectar metodos 
	public Iterable<Receta> selectAll(){
		return this.crudRepository.findAll();
	}
}
