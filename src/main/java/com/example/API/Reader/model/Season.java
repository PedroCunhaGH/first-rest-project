package com.example.API.Reader.model;


import lombok.Data;

@Data
public class Season {
    private Integer id;
    private String startDate;
    private String endDate;
    private int currentMatchday;
}
