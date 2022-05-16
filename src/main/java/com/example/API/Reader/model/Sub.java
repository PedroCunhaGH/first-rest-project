package com.example.API.Reader.model;

import lombok.Data;

@Data
public class Sub {
    private Integer minute;
    private Team team;
    private Player playerOut;
    private Player playerIn;
}
