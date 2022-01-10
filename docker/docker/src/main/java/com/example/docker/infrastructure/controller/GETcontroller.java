package com.example.docker.infrastructure.controller;

import com.example.docker.aplication.port.GETport;
import com.example.docker.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GETcontroller {
    @Autowired
    GETport geTport;

    @GetMapping("/id/{id}")
    public Person getByID (@PathVariable int id) throws Exception{
        return geTport.getByID(id);
    }

    @GetMapping("/name/{name}")
    public List<Person> personName (@PathVariable String name) throws Exception{
        return geTport.findByName(name);
    }

    @GetMapping("/allPerson")
    public List <Person> getAllPerson() throws Exception {
        return geTport.getAllPerson();
    }

}
