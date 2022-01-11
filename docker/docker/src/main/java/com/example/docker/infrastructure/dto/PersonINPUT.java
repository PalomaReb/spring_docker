package com.example.docker.infrastructure.dto;

import com.example.docker.domain.Person;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class PersonINPUT {
    private String userName;
    private String password;
    private String name;
    private String lastName;
    private String company_email;
    private String personal_email;
    private String city;
    private boolean active;
    private Date created_date;
    private String image_url;
    private Date term_date;

    public Person toOutput(PersonINPUT personINPUT) {
        Person person = new Person();

        person.setUserName(personINPUT.getUserName());
        person.setPassword(personINPUT.getPassword());
        person.setName(personINPUT.getName());
        person.setLastName(personINPUT.getLastName());
        person.setCompany_email(personINPUT.getCompany_email());
        person.setPersonal_email(personINPUT.getPersonal_email());
        person.setCity(personINPUT.getCity());
        person.setActive(personINPUT.isActive());
        person.setCreated_date(personINPUT.getCreated_date());
        person.setImage_url(personINPUT.getImage_url());
        person.setTerm_date(personINPUT.getTerm_date());

        return person;

    }
}