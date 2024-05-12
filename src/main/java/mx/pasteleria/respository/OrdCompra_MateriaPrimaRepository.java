package mx.pasteleria.respository;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import mx.pasteleria.crudRespository.OrdCompra_MateriaPrimaCrudRepository;
import mx.pasteleria.entity.OrdCompra_MateriaPrima;

@Entity
public class OrdCompra_MateriaPrimaRepository {
	@Autowired
	private OrdCompra_MateriaPrimaCrudRepository crudRepository;
	
	//Inyectar metodos 
	public Iterable<OrdCompra_MateriaPrima> selectAll(){
		return this.crudRepository.findAll();
	}
}
