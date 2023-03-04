package com.example.springmongoproject.repositories;

import com.example.springmongoproject.models.InPlace;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InPlaceRepository extends MongoRepository<InPlace, String> {
}
