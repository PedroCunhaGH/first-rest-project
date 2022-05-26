package com.example.API.Reader.controller;

import com.example.API.Reader.model.League;
import com.example.API.Reader.model.LeagueList;
import com.example.API.Reader.model.Person;
import com.example.API.Reader.repository.FavLeagueRepository;
import com.example.API.Reader.repository.LeagueRepository;
import com.example.API.Reader.repository.UsersRepository;
import com.example.API.Reader.service.LeagueService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HomeController {

    @Autowired
    LeagueService leagueservice;

    @Autowired
    FavLeagueRepository teamRepository;

    @Autowired
    UsersRepository usersRepository;

    @RequestMapping(value={"","/","home"})
    public String displayLeagues(Model model){
        LeagueList leagues = leagueservice.getLeagues();
        model.addAttribute("leagues", leagues.getData());
        return "home.html";
    }

    @RequestMapping(value="/insertFav")
    public String insertFav(Authentication authentication, @RequestParam String leagueName){
        if(authentication != null){
            Person person = usersRepository.readByName(authentication.getName());
            if (teamRepository.selectFavs(person.getPersonID(), leagueName) == 0){
                teamRepository.insertIntoFavs(person.getPersonID(), leagueName);
                return "success.html";
            }
            else return "oops.html";
        }
        else return "login.html";

    }
    
}
