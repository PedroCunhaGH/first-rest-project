package com.example.API.Reader.model;

import lombok.Data;

@Data
public class Types {

    private String id;
    private String name;
    private String abbreviation;
    private String startDate;
    private String endDate;
    private boolean hasStandings;

}
