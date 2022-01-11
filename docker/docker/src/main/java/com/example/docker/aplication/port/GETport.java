package com.example.docker.aplication.port;

import com.example.docker.domain.Person;

import java.util.List;

public interface GETport {
    public List<Person>getAllPerson();
    public List<Person> findByName(String Name);
    public Person getByID(int id) throws Exception;
}
