package com.example.API.Reader.model;

import lombok.Data;

@Data

public class Team {

    private Integer id;
    private String uid;
    private String name;
    private String location;
    private String abbreviation;
    private String displayName;
    private String shortDisplayName;
    private boolean isActive;
    private TeamLogos logos;
    /*
     * private List<Player> lineup=new ArrayList<Player>();
     * private List<Player> bench=new ArrayList<Player>();
     */

}
