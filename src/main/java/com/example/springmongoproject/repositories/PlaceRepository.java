package com.example.springmongoproject.repositories;

import com.example.springmongoproject.models.Place;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceRepository extends MongoRepository<Place, String> {
    List<Place> findByName(String name);

    void deleteByName(String name);
}
