package com.cab_invoice;

public class CabInvoiceGenerator {
    public static final double costPerKilometer = 10.0;
    public static final double costPerMinute = 1.0;
    public static final double minFare = 5.0;


    public double calculateFare(double distance, int time){

       double totalFare = (distance * costPerKilometer) + (time*costPerMinute);
       if(totalFare < 5){
           return minFare;
       }
       return  totalFare;
    }
}
