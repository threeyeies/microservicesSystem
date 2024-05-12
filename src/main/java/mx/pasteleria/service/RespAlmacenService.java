package mx.pasteleria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.pasteleria.respository.RespAlmacenRepository;

@Service
public class RespAlmacenService {
	@Autowired
	private RespAlmacenRepository repository;
	
	//Implementar logica de negocio
}
