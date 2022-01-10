package com.example.docker.infrastructure.controller;

import com.example.docker.aplication.port.POSTport;
import com.example.docker.infrastructure.dto.PersonINPUT;
import com.example.docker.infrastructure.dto.PersonOUTPUT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class POSTcontroller {
    @Autowired
    POSTport posTport;

    @PostMapping("addPerson")
    public PersonOUTPUT addNewPerson (@RequestBody PersonINPUT personINPUT)throws Exception{
        return posTport.addPerson(personINPUT);
    }

}
