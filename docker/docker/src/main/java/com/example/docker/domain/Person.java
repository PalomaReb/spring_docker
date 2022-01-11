package com.example.docker.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name="Person")
public class Person {

        @Id
        @GeneratedValue
        private int id;

        private String user;
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


}

