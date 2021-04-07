package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
public class AirportController {
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
}
