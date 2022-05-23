package com.example.API.Reader.controller;

import com.example.API.Reader.model.League;
import com.example.API.Reader.model.LeagueList;
import com.example.API.Reader.service.LeagueService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/home")
public class HomeController {

    @Autowired
    LeagueService leagueservice;

    @RequestMapping(value={"","/","home"})
    public String displayLeagues(Model model){
        LeagueList leagues = leagueservice.getLeagues();
        //System.out.println(leagues.getData());
        model.addAttribute("leagues", leagues.getData());
        return "home.html";
    }
    
}
