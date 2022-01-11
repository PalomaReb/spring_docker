package com.example.docker.infrastructure.dto;

import com.example.docker.domain.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonOUTPUT {
    private int id;
    private String userName;
    private String password;
    private String name;
    private String lastName;
    private String company_email;
    private String personal_email;
    private String city;
    private Boolean active;
    private Date created_date;
    private String image_url;
    private Date term_date;

    public PersonOUTPUT changeDTO(Person person){
        PersonOUTPUT personOUTPUT = new PersonOUTPUT();
        this.id = person.getId();
        this.userName  = person.getUserName();
        this.password = person.getPassword();
        this.name = person.getName();
        this.lastName = person.getLastName();
        this.company_email = person.getCompany_email();
        this.personal_email = person.getPersonal_email();
        this.city = person.getCity();
        this.active = person.getActive();
        this.created_date = person.getCreated_date();
        this.image_url = person.getImage_url();
        this.term_date = person.getTerm_date();


        return personOUTPUT;
    }

}
