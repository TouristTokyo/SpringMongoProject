package com.example.springmongoproject.services;

import com.example.springmongoproject.models.Person;
import com.example.springmongoproject.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersonsByName(String name) {
        return personRepository.findByName(name);
    }

    @Transactional
    public void save(Person person) {
        personRepository.save(person);
    }

    @Transactional
    public void savePersons(List<Person> persons) {
        personRepository.saveAll(persons);
    }

    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    @Transactional
    public void deleteByName(String name) {
        personRepository.deleteByName(name);
    }
}
