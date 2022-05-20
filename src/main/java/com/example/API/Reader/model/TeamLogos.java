package com.example.API.Reader.model;

import lombok.Data;

@Data
public class TeamLogos {

    private String href;
    private Integer width;
    private Integer height;
    private String alt;
    private Rel rel;
    private String lastUpdated;

}
