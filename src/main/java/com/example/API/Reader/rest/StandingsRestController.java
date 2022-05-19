package com.example.API.Reader.rest;

import com.example.API.Reader.model.Standings;
import com.example.API.Reader.proxy.StandingsProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/leagues", produces = { MediaType.APPLICATION_JSON_VALUE })
public class StandingsRestController {

    @Autowired
    StandingsProxy standingsProxy;

    @GetMapping("{id}/standings")
    @ResponseBody
    public Standings getStanding(@PathVariable("id") String id,
            @RequestParam(name = "sort", defaultValue = "asc", required = false) String sort,
            @RequestParam("season") Integer year) {

        return standingsProxy.getStanding(id, year, sort);
    }

}