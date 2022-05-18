package com.example.API.Reader.proxy;

import java.util.List;

import com.example.API.Reader.config.FeignConfig;
import com.example.API.Reader.config.ProjectConfiguration;
import com.example.API.Reader.model.DataLeague;
import com.example.API.Reader.model.League;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import feign.Headers;

@FeignClient(name = "league", url = "https://api-football-standings.azharimm.site", configuration = FeignConfig.class)

public interface LeagueProxy {

    @RequestMapping(method = RequestMethod.GET, value = "/leagues/{id}")
    @Headers(value = "Content-Type: application/json")

    public League getLeague(@PathVariable("id") String id);

}