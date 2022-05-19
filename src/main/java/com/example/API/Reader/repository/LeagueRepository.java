package com.example.API.Reader.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.example.API.Reader.model.Person;
import com.example.API.Reader.model.favLeagues;

public interface LeagueRepository extends JpaRepository<favLeagues, Integer> {

    List<favLeagues> findByPersonID(Person id);

}
