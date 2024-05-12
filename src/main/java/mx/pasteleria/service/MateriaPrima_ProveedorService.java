package mx.pasteleria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.pasteleria.respository.MateriaPrima_ProveedorRepository;

@Service
public class MateriaPrima_ProveedorService {
	@Autowired
	private MateriaPrima_ProveedorRepository repository;
	
	//Implementar logica de negocio
}
