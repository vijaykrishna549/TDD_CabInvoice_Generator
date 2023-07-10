package com.cab_invoice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CabInvoiceGeneratorTest {
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

    @Test
    void calculateFare() {
        double distance = 2;
        int time = 5;
        double result = cabInvoiceGenerator.calculateFare(distance,time);
        assertEquals(25,result);
    }
}