package com.example.API.Reader.proxy;

import com.example.API.Reader.config.FeignConfig;
import com.example.API.Reader.model.LeagueList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import feign.Headers;

@FeignClient(name = "all-leagues", url = "https://api-football-standings.azharimm.site", configuration = FeignConfig.class)
public interface AllLeaguesProxy {

    @RequestMapping(method = RequestMethod.GET, value = "/leagues")
    @Headers(value = "Content-Type: application/json")

    public LeagueList getAllLeagues();
    
}
