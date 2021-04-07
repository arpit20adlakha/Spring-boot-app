package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class InkSupply {
    private final String INK_MESSAGE = "This is ink supply";

    public String getMessage(){
        return INK_MESSAGE;
    }
}
