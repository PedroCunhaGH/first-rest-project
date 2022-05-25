package com.example.API.Reader.model;

import lombok.Data;

import java.util.List;


@Data
public class DataStandings {

    private Team team;
    private Note note;
    private List<Stats> stats;

}
