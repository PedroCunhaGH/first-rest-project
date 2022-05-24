package com.example.API.Reader.service;

import com.example.API.Reader.model.Standings;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StandingsService {
    
    
    public Standings getStandings(String id){
        System.out.println("TESTE "+id);

        RestTemplate restTemplate = new RestTemplate();
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        restTemplate = restTemplateBuilder.build();

        Standings standings = restTemplate.getForObject("http://localhost:8081/api/leagues/{id}/standings?season=2021", Standings.class, id);
        
        System.out.println(standings);
        return standings;
        
    }
    
}
