package com.example.API.Reader.model;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Standings {

    private League league;
    private List<Team> teams;
    private Note note;

}
