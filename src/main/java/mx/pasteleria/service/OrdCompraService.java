package mx.pasteleria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.pasteleria.respository.OrdCompraRepository;

@Service
public class OrdCompraService {
	@Autowired
	private OrdCompraRepository repository;
	
	//Implementar logica de negocio
}
