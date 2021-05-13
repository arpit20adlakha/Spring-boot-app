package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
public class AirportController {

    @Autowired
    private MoviesRepository moviesRepository;

    private List<AirportInfo> airportInfoList = new ArrayList<>();
    private static final String SERVICE_WARNING_MESSAGE = "Berlin Schönefeld is closed for service today";

    public AirportController() {
        airportInfoList.add(new AirportInfo("Berlin Teggel", "TXL", "EDDT"));
        airportInfoList.add(new AirportInfo("Berlin Schönefeld", "SXF", "EDDB"));
    }

    @GetMapping("airports/{id}")
    public AirportInfo getAirportInfo(@PathVariable int id) {
        AirportInfo airportInfo =  airportInfoList.get(id);
        if (Objects.equals(airportInfo.getName(), "Berlin Teggel")) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, SERVICE_WARNING_MESSAGE);
        }
        return airportInfo;
    }

    @PostMapping(path = "/movie/add", consumes = "application/json")
    public @ResponseBody String addMovie(@RequestBody Movie movie) {
        Movies mov = new Movies(movie.getName(), movie.getReleaseDate(), movie.getDuration(), null, movie.getRating());
        moviesRepository.save(mov);
        return "Saved check in db";
    }


}
