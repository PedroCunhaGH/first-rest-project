package com.example.API.Reader.service;

import com.example.API.Reader.model.Person;
import com.example.API.Reader.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private UsersRepository personRepository;

    public boolean createNewPerson(Person person){
        boolean isSaved = false;
        person.setRole("USER");
        person = personRepository.save(person);
        if (null != person && person.getPersonID() > 0)
        {
            isSaved = true;
        }
        return isSaved;
    }
}
