package mx.pasteleria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.pasteleria.service.OrdProd_ProdService;

@RestController
@RequestMapping("/OrdProd_Prod")
public class OrdProd_ProdController {
	@Autowired
	private OrdProd_ProdService service;
	//Implementar el mapeo de los servicios REST invocados desde el frontend
}
