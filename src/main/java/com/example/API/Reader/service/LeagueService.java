package com.example.API.Reader.service;

import com.example.API.Reader.model.League;
import com.example.API.Reader.model.LeagueList;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LeagueService {

    public LeagueList getLeagues(){

        RestTemplate restTemplate = new RestTemplate();
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        restTemplate = restTemplateBuilder.build();

        LeagueList leagues = restTemplate.getForObject("http://localhost:8081/api/leagues", LeagueList.class);
        
        //System.out.println(leagues);
        return leagues;
        
    }
    
}
