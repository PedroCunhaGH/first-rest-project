package com.example.API.Reader.proxy;

import com.example.API.Reader.config.FeignConfig;
import com.example.API.Reader.model.Standings;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import feign.Headers;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "standing", url = "https://api-football-standings.azharimm.site", configuration = FeignConfig.class)

public interface StandingsProxy {

    @RequestMapping(method = RequestMethod.GET, value = "/leagues/{id}/standings?season={year}&sort=asc")
    @Headers(value = "Content-Type: application/json")

    public Standings getStanding(@PathVariable("id") String id, @RequestParam("year") Integer year);

}