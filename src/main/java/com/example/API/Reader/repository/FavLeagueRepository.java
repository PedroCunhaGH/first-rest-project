package com.example.API.Reader.repository;

import com.example.API.Reader.model.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface FavLeagueRepository extends JpaRepository<Person,Integer> {
    

    @Transactional
    @Modifying
    @Query(value="INSERT INTO fav_leagues (personID, leagueID) VALUES (?1, ?2)", nativeQuery = true)
    int insertIntoFavs(int personID, String id);

    @Transactional
    @Query(value="Select count(leagueid) from fav_leagues where personid=?1 and leagueid=?2", nativeQuery = true)
    int selectFavs(int personID, String league);

}
