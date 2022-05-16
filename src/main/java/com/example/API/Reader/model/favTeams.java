package com.example.API.Reader.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class favTeams {

    @Id
    @Column(name = "teamID")
    private Integer teamID;

    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST, targetEntity = Person.class)
    @JoinColumn(name = "personID", referencedColumnName = "personID",nullable = false)
    private Person personID;
    
    @Column(name= "name")
    private String name;
    
}
