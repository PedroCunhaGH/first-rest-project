package com.example.API.Reader.model;

import lombok.Data;

@Data
public class Score {
    private String winner; //Enum? HOME_TEAM, AWAY_TEAM
    private String duration; //Enum? REGULAR, EXTRATIME, PENALTIES
    private Goals fullTime;
    private Goals halfTime;
    private Goals extraTime;
    private Goals penalties;
}
