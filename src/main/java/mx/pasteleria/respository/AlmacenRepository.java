package mx.pasteleria.respository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.pasteleria.crudRespository.AlmacenCrudRepository;
import mx.pasteleria.entity.Almacen;

@Repository
public class AlmacenRepository {
	@Autowired
	private AlmacenCrudRepository crudRepository;
	
	
	//Inyectar metodos 
	public Iterable<Almacen> selectAll(){
		return this.crudRepository.findAll();
	}
	
	public Optional<Almacen> selectById(Integer idAlmacen){
		return this.crudRepository.findById(idAlmacen);
	}
}
