package mx.pasteleria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.pasteleria.respository.MateriaPrimaRepository;

@Service
public class MateriaPrimaService {
	@Autowired
	private MateriaPrimaRepository repository;
	
	public boolean selectAll() {
		if(this.repository.selectAll().equals(null)) {
			return false;
			
		}
		else{
			this.repository.selectAll();
			return true;
		}
		
	}
}
