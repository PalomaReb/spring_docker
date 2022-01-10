package com.example.docker.infrastructure.controller;

import com.example.docker.aplication.port.DELETEport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DELETEcontroller {
    @Autowired
    DELETEport deletEport;

    @DeleteMapping("/delete/{id}")
    public void deleteByID (@PathVariable int id) throws Exception{
        deletEport.deleteByID(id);
    }
}
