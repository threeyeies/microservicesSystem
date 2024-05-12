package mx.pasteleria.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.pasteleria.crudRespository.UsuarioCrudRepository;
import mx.pasteleria.entity.Usuario;

@Repository
public class UsuarioRepository {
	@Autowired
	private UsuarioCrudRepository crudRepository;
	
	//Inyectar metodos 
	public Iterable<Usuario> selectAll(){
		return this.crudRepository.findAll();
	}
}
