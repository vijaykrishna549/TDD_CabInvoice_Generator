package com.cab_invoice;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CabInvoiceGeneratorTest {
//   CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator(3.0, 3);
    @Test
    public void fare(){
//        double distance = 3.0;
//        int time = 3;
//        double fare = cabInvoiceGenerator.calculateFare(distance, time);
        double fare = cabInvoiceGenerator.calculateFare();
        Assert.assertEquals(33.0, fare, 0.0);
    }
}