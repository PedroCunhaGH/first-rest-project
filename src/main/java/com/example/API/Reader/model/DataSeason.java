package com.example.API.Reader.model;

import lombok.Data;
import java.util.List;

@Data
public class DataSeason {

    private String name;
    private String abbreviation;
    private String seasonDisplay;
    private Integer season;
    private List<DataStandings> dataStandings;

}
