package mx.pasteleria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.pasteleria.respository.OrdCompra_MateriaPrimaRepository;

@Service
public class OrdCompra_MateriaPrimaService {
	@Autowired
	private OrdCompra_MateriaPrimaRepository repository;
	
	//Implementar logica de negocio
}
