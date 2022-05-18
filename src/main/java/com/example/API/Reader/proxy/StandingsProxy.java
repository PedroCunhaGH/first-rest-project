package com.example.API.Reader.proxy;

import java.util.List;

import com.example.API.Reader.config.ProjectConfiguration;
import com.example.API.Reader.model.Standings;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import feign.Headers;

@FeignClient(name = "standings", url = "https://api-football-standings.azharimm.site",
configuration = ProjectConfiguration.class)

public interface StandingsProxy {

    @RequestMapping(method = RequestMethod.GET, value = "leagues/{id}/standings?season={year}&sort=asc")
    @Headers(value = "Content-Type: application/json")

    public List<Standings> getStandings(@PathVariable("id") String id, @RequestParam("year") Integer year);



}