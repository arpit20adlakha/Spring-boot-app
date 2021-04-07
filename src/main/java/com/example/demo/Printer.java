package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Printer {
    private InkSupply inkSupply;

    @Autowired
    public Printer(InkSupply inkSupply) {
        this.inkSupply = inkSupply;
    }

    public void printHello(){
        System.out.println(inkSupply.getMessage());
    }
}
