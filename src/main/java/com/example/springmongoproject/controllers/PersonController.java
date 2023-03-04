package com.example.springmongoproject.controllers;


import com.example.springmongoproject.models.Person;
import com.example.springmongoproject.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping()
    public List<Person> getPersons() {
        return personService.getPersons();
    }

    @GetMapping("/{name}")
    public List<Person> getPerson(@PathVariable("name") String name) {
        return personService.getPersonsByName(name);
    }

    @PostMapping("/create")
    public ResponseEntity<HttpStatus> create(@RequestBody Person person) {
        personService.save(person);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<HttpStatus> delete(@RequestBody Person person){
        personService.deleteByName(person.getName());
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
