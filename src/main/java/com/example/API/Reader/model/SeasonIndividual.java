package com.example.API.Reader.model;

import java.util.List;

import lombok.Data;

@Data
public class SeasonIndividual {

    private Integer year;
    private String startDate;
    private String endDate;
    private String displayName;
    private List<Types> type;

}
