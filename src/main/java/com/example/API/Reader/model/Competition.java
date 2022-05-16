package com.example.API.Reader.model;

import java.util.List;

import lombok.Data;

@Data
public class Competition {

    private Integer id;
    private String name;
    private Boolean code;
    private String plan;
    private List<Season> currentSeason;
    private String numberOfAvailableSeasons;

}
