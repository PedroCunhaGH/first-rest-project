package com.example.API.Reader.controller;

import com.example.API.Reader.model.Person;
import com.example.API.Reader.repository.LeagueRepository;
import com.example.API.Reader.repository.UsersRepository;
import org.springframework.security.core.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FavsTableController {
    
    @Autowired
    LeagueRepository teamRepository;
    @Autowired
    UsersRepository usersRepository;

    @RequestMapping(value = "/favsTable",  method = { RequestMethod.GET})
    public String getAll(Model model, Authentication authentication){
        String authName = authentication.getName();
        Person person = usersRepository.readByName(authName);
        model.addAttribute("favTeams",teamRepository.findByPersonID(person));
        System.out.println("TESTE"+model);
        return "favsTable.html";
    }
    
}
