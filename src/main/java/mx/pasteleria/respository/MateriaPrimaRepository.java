package mx.pasteleria.respository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.pasteleria.crudRespository.MateriaPrimaCrudRepository;
import mx.pasteleria.entity.MateriaPrima;

@Repository
public class MateriaPrimaRepository {
	@Autowired
	private MateriaPrimaCrudRepository crudRepository;
	
	public Iterable<MateriaPrima> selectAll(){
		return this.crudRepository.findAll();
	}
	
	public Optional<MateriaPrima> selectById(Integer idMateriaPrima){
		return this.crudRepository.findById(idMateriaPrima);
	}
}
