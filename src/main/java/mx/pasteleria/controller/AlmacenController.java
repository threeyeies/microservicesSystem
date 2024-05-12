package mx.pasteleria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.pasteleria.service.AlmacenService;

@RestController
@RequestMapping("/Almacen")
public class AlmacenController {
	@Autowired
	private AlmacenService service;
	//Implementar el mapeo de los servicios REST invocados desde el frontend
}
