package com.example.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class UsdConverterTest {

    @Mock
    private ExchangeService service = Mockito.mock(ExchangeService.class);

    private UsdConverter converter = new UsdConverter(service);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testConvertToUsd() {
        Mockito.when(service.getUsd()).thenReturn(BigDecimal.valueOf(5));
        BigDecimal result = converter.convertToUsd(BigDecimal.valueOf(2));
        BigDecimal expected = BigDecimal.valueOf(10);

        assertEquals(expected, result);
    }
}