package com.example.docker.aplication.usecase;

import com.example.docker.aplication.port.POSTport;
import com.example.docker.domain.PersonJPA;
import com.example.docker.infrastructure.dto.PersonINPUT;
import com.example.docker.infrastructure.dto.PersonOUTPUT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class POSTusecase implements POSTport {

    @Autowired
    PersonJPA personJPA;

    public PersonOUTPUT addPerson(PersonINPUT person) throws Exception {
        if(person == null){throw new Exception("Persona mandada vacia");}
        if(person.getName().length() <6  && person.getName().length()>10){throw new Exception("nombre tiene que estar entre 6 y 10 characteres");}
        personJPA.saveAndFlush(person.toOutput(person));
        PersonOUTPUT personOUTPUT = new PersonOUTPUT();
        return personOUTPUT.changeDTO(person.toOutput(person));
    }

}
