// package com.example.API.Reader.proxy;

// import java.util.List;

// import com.example.API.Reader.config.ProjectConfiguration;
// import com.example.API.Reader.model.League;

// import org.springframework.cloud.openfeign.FeignClient;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;

// import feign.Headers;

// @FeignClient(name = "competition", url = "http://api-football-data.org",
// configuration = ProjectConfiguration.class)
// public interface CompetitionProxy {

// @RequestMapping(method = RequestMethod.GET, value = "/v2/competitions")
// @Headers(value = "Content-Type: application/json")

// // public static List<League> getCompetitions(@RequestParam("id") Integer id)
// {
// // return null;
// // }
// }
