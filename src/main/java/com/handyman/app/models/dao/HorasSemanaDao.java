package com.handyman.app.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.handyman.app.models.documents.*;

@Repository
public interface HorasSemanaDao extends ReactiveMongoRepository<HorasSemana, String>{

}
