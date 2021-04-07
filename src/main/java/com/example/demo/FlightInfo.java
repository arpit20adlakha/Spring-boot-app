package com.example.demo;

public class FlightInfo {
    private String from;
    private String to;
    private String gate;

    public FlightInfo(String from, String to, String gate) {
        this.from = from;
        this.to = to;
        this.gate = gate;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }
}
