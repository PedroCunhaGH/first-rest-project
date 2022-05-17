package com.example.API.Reader.controller;


import com.example.API.Reader.model.Standings;
import com.example.API.Reader.proxy.StandingsProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StandingsController {

    @Autowired
    StandingsProxy standingsProxy;

    @GetMapping("leagues/{id}/standings?season={year}&sort=asc")
    public List<Standings> getStandings(@PathVariable("id") String id, @RequestParam("year") Integer year){
        return standingsProxy.getStandings("por.1", 2020);
    }

}
