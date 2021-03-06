package com.example.API.Reader.rest;

import com.example.API.Reader.model.League;
import com.example.API.Reader.proxy.LeagueProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/leagues", produces = { MediaType.APPLICATION_JSON_VALUE })
public class LeagueRestController {

    @Autowired
    LeagueProxy leagueProxy;

    @GetMapping("{id}")
    @ResponseBody
    public League getLeague(@PathVariable("id") String id) {
        return leagueProxy.getLeague(id);
    }

}
