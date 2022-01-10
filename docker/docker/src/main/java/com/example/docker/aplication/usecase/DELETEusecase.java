package com.example.docker.aplication.usecase;

import com.example.docker.aplication.port.DELETEport;
import com.example.docker.domain.PersonJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DELETEusecase implements DELETEport {

    @Autowired
    PersonJPA personJPA;


    @Override
    public void deleteByID(int id) throws Exception {
        if(personJPA.findById(id).isPresent()){
            personJPA.deleteById(id);
        }
    }
}
