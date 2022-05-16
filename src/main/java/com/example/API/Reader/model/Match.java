package com.example.API.Reader.model;

import lombok.Data;
import org.apache.catalina.valves.rewrite.Substitution;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Match {

    private Integer id;
    private Competition competition;
    private Season season;
    private String utcDate;
    private Status status;
    private Integer matchDay;
    private String stage;
    private String group;
    private String venue;
    private String lastUpdated;
    private Team homeTeam;
    private Team awayTeam;
    private Score score;
    /*
    private List<Goal> goals=new ArrayList<Goal>();
    private List<Booking> bookings=new ArrayList<Booking>();
    private List<Sub> substitutions=new ArrayList<Sub>();
     */
    private List<Referee> referees=new ArrayList<Referee>();

}
