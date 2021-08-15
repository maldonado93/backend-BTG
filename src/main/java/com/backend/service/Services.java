package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.entity.Entidad;
import com.backend.repository.Repositorys;




@Service
public class Services {
	@Autowired
	Repositorys repositorys;
	
	
	public Entidad guardar(Entidad entity) {
		return repositorys.save(entity);
	}
		
	public Entidad consultarPorId(String id) {
		return repositorys.findById(id).orElse(null);
	}
	
	public List<Entidad>consultarTodos() {
		return repositorys.findAll();
	}
	
	public void EliminarPorID(String id) {
		repositorys.deleteById(id);
		
	}


}


