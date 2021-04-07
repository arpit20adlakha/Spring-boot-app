package com.example.demo;

import java.math.BigDecimal;

public class UsdConverter {
    private ExchangeService service;

    public UsdConverter(ExchangeService service) {
        this.service = service;
    }

    public BigDecimal convertToUsd(BigDecimal converted) {
        return converted.multiply(service.getUsd());
    }

}
