package com.gps.tn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gps.tn.entity.Voiture;

public interface VoitureRepository  extends MongoRepository<Voiture, Long>{
}
