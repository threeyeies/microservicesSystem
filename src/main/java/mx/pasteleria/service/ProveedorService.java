package mx.pasteleria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.pasteleria.respository.ProveedorRepository;

@Service
public class ProveedorService {
	@Autowired
	private ProveedorRepository repository;
	
	//Implementar logica de negocio
}
