package com.example.API.Reader.repository;

import com.example.API.Reader.model.Person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Person,Integer> {
    
}
