package com.example.API.Reader.rest;

import java.util.List;

import com.example.API.Reader.model.League;
import com.example.API.Reader.proxy.AllLeaguesProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/leagues", produces = { MediaType.APPLICATION_JSON_VALUE })
public class AllLeaguesRestController {

    @Autowired
    AllLeaguesProxy allLeaguesProxy;

    @GetMapping
    @ResponseBody
    public List<League> getAllLeagues() {
        return allLeaguesProxy.getAllLeagues();
    }

}