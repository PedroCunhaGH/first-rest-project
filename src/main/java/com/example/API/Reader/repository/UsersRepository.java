package com.example.API.Reader.repository;

import com.example.API.Reader.model.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface UsersRepository extends JpaRepository<Person,Integer> {
    
    Person readByName(String name);



}
