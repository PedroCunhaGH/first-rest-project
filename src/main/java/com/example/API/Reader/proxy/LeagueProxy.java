package com.example.API.Reader.proxy;

import java.util.List;

import com.example.API.Reader.config.ProjectConfiguration;
import com.example.API.Reader.model.League;

import com.example.API.Reader.model.Standings;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import feign.Headers;

@FeignClient(name = "league", url = "https://api-football-standings.azharimm.site",
        configuration = ProjectConfiguration.class)

public interface LeagueProxy {

    @RequestMapping(method = RequestMethod.GET, value = "leagues/{id}")
    @Headers(value = "Content-Type: application/json")

    public List<League> getLeague(@PathVariable("id") String id);

}