package com.example.API.Reader.model;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Standings {

    private List<Team> teams=new ArrayList<Team>();

}
