package com.example.API.Reader.controller;

import com.example.API.Reader.model.League;
import com.example.API.Reader.proxy.LeagueProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/leagues", produces = { MediaType.APPLICATION_JSON_VALUE })
public class LeagueController {

    @Autowired
    LeagueProxy leagueProxy;

    @GetMapping("/leagues/{id}")
    public List<League> getLeague(@PathVariable("id") String id) {
        return leagueProxy.getLeague("por.1");
    }

}
