package mx.pasteleria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.pasteleria.respository.ProdRepository;

@Service
public class ProdService {
	@Autowired
	private ProdRepository repository;
	
	//Implementar logica de negocio
}
