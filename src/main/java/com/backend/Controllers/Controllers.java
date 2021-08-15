package com.backend.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.backend.entity.Entidad;
import com.backend.service.Services;



@RestController
@RequestMapping(path = "/btg")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE })
public class Controllers {
	@Autowired
	Services services;
		
	@PostMapping(value = "guardar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> guardar(@RequestBody Entidad entity) {
		return new ResponseEntity<Object>(services.guardar(entity), HttpStatus.valueOf(200));
	}
			
	@GetMapping(value = "listarPorId/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> listarPorId(@PathVariable(name ="id")String id) {
		return new ResponseEntity<Object>(services.consultarPorId(id), HttpStatus.valueOf(200));
	}
			
	@GetMapping(value = "listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> listar() {
		return new ResponseEntity<Object>(services.consultarTodos(), HttpStatus.valueOf(200));
	}
	
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity EliminarPorID(@PathVariable String id) {
		services.EliminarPorID(id);
		return new ResponseEntity<Object>("Eliminado con exito", HttpStatus.valueOf(200));
	}
	

}
