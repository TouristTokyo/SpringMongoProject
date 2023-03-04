package com.example.springmongoproject.repositories;

import com.example.springmongoproject.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
    List<Person> findByName(String name);

    void deleteByName(String name);

}
