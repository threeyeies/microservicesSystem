package mx.pasteleria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.pasteleria.service.OrdCompra_MateriaPrimaService;

@RestController
@RequestMapping("/OrdCompra_MateriaPrima")
public class OrdCompra_MateriaPrimaController {
	@Autowired
	private OrdCompra_MateriaPrimaService service;
	//Implementar el mapeo de los servicios REST invocados desde el frontend
}
