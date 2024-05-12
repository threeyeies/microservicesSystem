package mx.pasteleria.crudRespository;

import org.springframework.data.repository.CrudRepository;

import mx.pasteleria.entity.Usuario;

public interface UsuarioCrudRepository extends CrudRepository<Usuario, String> {

}
