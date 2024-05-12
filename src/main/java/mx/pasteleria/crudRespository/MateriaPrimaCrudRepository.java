package mx.pasteleria.crudRespository;

//import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import mx.pasteleria.entity.MateriaPrima;

public interface MateriaPrimaCrudRepository extends CrudRepository<MateriaPrima, Integer>{
	
	/*Aquí se implementan metodos más especificos como con where o condiciones
	 * de tal manera que creas tus metodos para acceder a ellos en las clase repository
	 * 
	 * Spring ya tiene select, update, insert y delete y solo hace falta mandarlos a traer
	 * como si estuviesen implementados aquí... esto se debe a que extiende de org.springframework.data.repository.CrudRepositor
	 * y ahi es donde se hace la logica de relacion al parametrizar el importe con "Materia Prima"
	 */
	
}
