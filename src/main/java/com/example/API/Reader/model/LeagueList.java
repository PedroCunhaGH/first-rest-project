package com.example.API.Reader.model;

import java.util.List;

import lombok.Data;

@Data
public class LeagueList {

    private boolean status;
    private List<DataLeague> data;

}
