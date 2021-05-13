package com.example.demo;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AirportInfo {
    private String name;
    private String code;
    private String stCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStCode() {
        return stCode;
    }

    public void setStCode(String stCode) {
        this.stCode = stCode;
    }
}
