package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class FlightController {
    private List<FlightInfo> flightInfoList = new ArrayList<FlightInfo>();
    private static final String NOT_FOUND_MESSAGE = "Flight not found for number";

    public FlightController() {
        flightInfoList.add(new FlightInfo("Delhi Indira Gandhi", "Stuttgart", "D80"));
        flightInfoList.add(new FlightInfo("Tokio Haneda", "Frankfurt", "110"));
        flightInfoList.add(new FlightInfo("Kilimanjaro Arusha", "Boston", "15"));
        flightInfoList.add(new FlightInfo("Berlin Schönefeld", "Tenerife", "15"));
    }

    @GetMapping( "flights/{id}")
    public FlightInfo getFlightInfo(@PathVariable int id ) {
        System.out.println("Entered Here");
//        return flightInfoList.get(id);
        if (id > flightInfoList.size()) {
            throw new FlightNotFoundException("Flight not found for id =" + id);
        }
        return flightInfoList.get(id);
    }

    @ExceptionHandler(IndexOutOfBoundsException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = NOT_FOUND_MESSAGE)
    public Map<String, String> handleIndexOutOfBoundException(Exception e) {
        Map<String, String> response = new HashMap<>();
        response.put("message", NOT_FOUND_MESSAGE);
        response.put("error", e.getClass().getSimpleName());
        return response;
    }
}
