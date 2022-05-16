package com.example.API.Reader.model;


import lombok.Data;

@Data
public class Booking {
    private Integer minute;
    private Team team;
    private Player player;
    private String card; //ENUM??
}
