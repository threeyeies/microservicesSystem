package mx.pasteleria.crudRespository;

import org.springframework.data.repository.CrudRepository;

import mx.pasteleria.entity.OrdCompra_MateriaPrima;

//Void como parametro de implementacion para cuando son tablas intermedias por normalizacion para elimiar el muchos a muchos
public interface OrdCompra_MateriaPrimaCrudRepository extends CrudRepository<OrdCompra_MateriaPrima, Void>{

}
