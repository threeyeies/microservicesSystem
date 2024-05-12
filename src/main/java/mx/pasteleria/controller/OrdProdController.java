package mx.pasteleria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.pasteleria.service.OrdProdService;

@RestController
@RequestMapping("/OrdProd")
public class OrdProdController {
	@Autowired
	private OrdProdService service;
	//Implementar el mapeo de los servicios REST invocados desde el frontend
}
