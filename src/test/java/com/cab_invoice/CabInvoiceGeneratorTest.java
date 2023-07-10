package com.cab_invoice;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CabInvoiceGeneratorTest {
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

    @Test
    public void totalFare(){
        double distance = 3.0;
        int time = 3;
        double fare = cabInvoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(33.0, fare, 0.0);
    }
}