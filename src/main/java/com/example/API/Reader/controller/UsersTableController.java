package com.example.API.Reader.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.API.Reader.repository.UsersRepository;
import com.example.API.Reader.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UsersTableController {
    
    @Autowired
    UsersRepository usersRepository;

    @RequestMapping(value = "/usersTable", method = { RequestMethod.GET})
    public String getAll(Model model){
        model.addAttribute("users",usersRepository.findAll());
        System.out.println(model);
        return "usersTable.html";
    }

    

}
