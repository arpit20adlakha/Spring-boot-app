package com.example.demo;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class ExchangeService {
    private String name;
    private int id;

    public BigDecimal getUsd() {
        return BigDecimal.valueOf(70);
    }
}
