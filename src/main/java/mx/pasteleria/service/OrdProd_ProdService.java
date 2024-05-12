package mx.pasteleria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.pasteleria.respository.OrdProd_ProdRepository;

@Service
public class OrdProd_ProdService {
	@Autowired
	private OrdProd_ProdRepository repository;
	
	//Implementar logica de negocio
}
