package com.example.API.Reader.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.example.API.Reader.model.Person;
import com.example.API.Reader.model.favTeams;

public interface TeamRepository extends JpaRepository<favTeams,Integer> {

    List<favTeams> findByPersonID(Person id);
    
}
