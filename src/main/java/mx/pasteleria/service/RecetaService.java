package mx.pasteleria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.pasteleria.respository.RecetaRepository;

@Service
public class RecetaService {
	@Autowired
	private RecetaRepository repository;
	
	//Implementar logica de negocio
}
