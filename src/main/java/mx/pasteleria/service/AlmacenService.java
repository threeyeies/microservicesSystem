package mx.pasteleria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.pasteleria.respository.AlmacenRepository;

@Service
public class AlmacenService {
	@Autowired
	private AlmacenRepository repository;
	
	//Implementar logica de negocio
}
