package mx.pasteleria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.pasteleria.entity.MateriaPrima;
import mx.pasteleria.service.MateriaPrimaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/MateriaPrima")
public class MateriaPrimaController {
	@Autowired
	private MateriaPrimaService service;
	
	@GetMapping("/select")
	public boolean getMateriaPrima(@RequestParam MateriaPrima materiaPrima) {
		return this.service.selectAll();
	}
	
}
