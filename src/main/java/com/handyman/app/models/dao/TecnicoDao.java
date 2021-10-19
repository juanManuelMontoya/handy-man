package com.handyman.app.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.handyman.app.models.documents.Tecnico;

@Repository
public interface TecnicoDao extends ReactiveMongoRepository<Tecnico, String> {

}
