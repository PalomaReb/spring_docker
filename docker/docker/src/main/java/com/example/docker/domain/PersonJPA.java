package com.example.docker.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonJPA extends JpaRepository <Person, Integer> {
    List<Person> findByName(String user);
}
