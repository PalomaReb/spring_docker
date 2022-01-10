package com.example.docker.aplication.port;

import com.example.docker.infrastructure.dto.PersonINPUT;
import com.example.docker.infrastructure.dto.PersonOUTPUT;

public interface POSTport {
    PersonOUTPUT addPerson (PersonINPUT person) throws Exception;
}
