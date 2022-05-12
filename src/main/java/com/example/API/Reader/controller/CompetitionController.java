package com.example.API.Reader.controller;

import java.util.List;

import com.example.API.Reader.model.Competition;
import com.example.API.Reader.proxy.CompetitionProxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompetitionController {

    @Autowired
    CompetitionProxy competitionProxy;

    @GetMapping("/v2/competitions")
    public List<Competition> getCompetitions(@RequestParam("id") Integer id) {
        return CompetitionProxy.getCompetitions(id);
    }
}
