package com.example.API.Reader.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data

public class Team {

    private Integer id;
    private String name;
    private String location;
    private String abbreviation;
    private String displayName;
    private String shortDisplayName;
    private boolean isActive;
    /*
    private List<Player> lineup=new ArrayList<Player>();
    private List<Player> bench=new ArrayList<Player>();
    */

}
