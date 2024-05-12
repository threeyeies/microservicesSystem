package mx.pasteleria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.pasteleria.respository.OrdProdRepository;

@Service
public class OrdProdService {
	@Autowired
	private OrdProdRepository repository;
	
	//Implementar logica de negocio
}
