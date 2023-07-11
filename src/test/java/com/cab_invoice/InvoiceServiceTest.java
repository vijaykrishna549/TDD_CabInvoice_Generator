package com.cab_invoice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
   /* InvoiceGenerator invoiceGenerator = null;
    @BeforeAll
    public void setUp() throws Exception{
        invoiceGenerator= new InvoiceGenerator();
    }*/

    @Test
    public void givenDistanceAndTime_ShouldReturn_TotalFare() {
InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(25, fare, 0.0);

    }

    @Test
    public void givenLessDistanceOrTime_shouldReturnMinFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(5, fare, 0.0);

    }

    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        Ride[] rides = {new Ride(2.0, 5),
                new Ride(0.1, 1),
                new Ride(5.0, 6)
        };
        InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new  InvoiceSummary(3,86);
        Assertions.assertEquals(expectedInvoiceSummary,summary);

    }

}
