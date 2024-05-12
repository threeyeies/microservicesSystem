package mx.pasteleria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.pasteleria.respository.RespCompraRepository;

@Service

public class RespCompraService {
	@Autowired
	private RespCompraRepository repository;
	
	//Implementar logica de negocio
}
