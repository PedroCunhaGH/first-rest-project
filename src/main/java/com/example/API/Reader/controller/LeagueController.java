package com.example.API.Reader.controller;


import com.example.API.Reader.model.League;
import com.example.API.Reader.model.Standings;
import com.example.API.Reader.proxy.LeagueProxy;
import com.example.API.Reader.proxy.StandingsProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LeagueController {

    @Autowired
    LeagueProxy leagueProxy;

    @GetMapping("leagues/{id}")
    public List<League> getLeague(@PathVariable("id") String id){
        return leagueProxy.getLeague("por.1");
    }

}
