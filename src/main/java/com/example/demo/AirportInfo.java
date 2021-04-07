package com.example.demo;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class AirportInfo {
    private String name;
    private String code;
    private String stCode;

    public AirportInfo(String name, String code, String stCode) {
        this.name = name;
        this.code = code;
        this.stCode = stCode;
    }

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
