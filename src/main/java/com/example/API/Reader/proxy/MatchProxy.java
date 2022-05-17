package com.example.API.Reader.proxy;

import java.util.List;

import com.example.API.Reader.config.ProjectConfiguration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import feign.Headers;

@FeignClient(name = "match", url = "http://api-football-data.org", configuration = ProjectConfiguration.class)
public interface MatchProxy {
    @RequestMapping(method = RequestMethod.GET, value = "/v2/matches/{id}")
    @Headers(value = "Content-Type: application/json")

    public static List<Match> getMatches(@RequestParam("id") Integer id) {
        return null;
    }
}

