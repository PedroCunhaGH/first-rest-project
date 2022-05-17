package com.example.API.Reader.model;

import java.util.List;

import lombok.Data;

@Data
public class Competition {

    private Integer id;
    private Area area;
    private String name;
    private Boolean code;
    private String plan;
    private Season currentSeason;
    private List<Season> seasons;
    private String numberOfAvailableSeasons;

}
