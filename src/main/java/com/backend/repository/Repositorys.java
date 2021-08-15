package com.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.backend.entity.Entidad;


@Repository
public interface Repositorys extends MongoRepository<Entidad, String> {
	
}