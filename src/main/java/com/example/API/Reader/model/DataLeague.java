package com.example.API.Reader.model;

import lombok.Data;

@Data
public class DataLeague {

    private String id;
    private String name;
    private String slug;
    private String abbr;
    private LeagueLogos logos;

}
