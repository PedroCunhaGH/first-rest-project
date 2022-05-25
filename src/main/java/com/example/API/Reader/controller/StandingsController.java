package com.example.API.Reader.controller;

import com.example.API.Reader.model.Standings;
import com.example.API.Reader.service.LeagueService;
import com.example.API.Reader.service.StandingsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StandingsController {

    @Autowired
    StandingsService standingsService;

    @RequestMapping(value="/standings")
    public String displayStandings(Model model, @RequestParam String id){

        Standings standings = standingsService.getStandings(id);
        System.out.println(standings.getData().getStandings());
        model.addAttribute("standings", standings.getData().getStandings());
        //model.addAttribute("stats", standings.getData().get);
        return "standings.html";
    }
    
}
