package com.example.API.Reader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)    
    @Column(name = "personID")
    private int personID;

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    private String role;

    @Column(name = "pwd")
    private String pwd;
    
}
