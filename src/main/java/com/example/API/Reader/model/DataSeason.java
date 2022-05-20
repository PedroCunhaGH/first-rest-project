package com.example.API.Reader.model;

import lombok.Data;

@Data
public class DataSeason {

    private String name;
    private String abbreviation;
    private String seasonDisplay;
    private Integer season;
    private StandingList dataStandings;

}
