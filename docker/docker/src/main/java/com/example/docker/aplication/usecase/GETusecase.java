package com.example.docker.aplication.usecase;

import com.example.docker.aplication.port.GETport;
import com.example.docker.domain.Person;
import com.example.docker.domain.PersonJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GETusecase implements GETport {

    @Autowired
    PersonJPA personJPA;

    public List<Person> getAllPerson(){
        return personJPA.findAll();
    }

    public List<Person> findByName( String Name){
    return  personJPA.findByName(Name);
    }

    public Person getByID(int id) throws Exception{
        return personJPA.getById(id);
    }



}
