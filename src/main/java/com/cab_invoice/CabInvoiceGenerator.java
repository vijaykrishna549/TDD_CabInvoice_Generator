package com.cab_invoice;

import java.util.ArrayList;

public class CabInvoiceGenerator {
    public static final double costPerKilometer = 10.0;
    public static final double costPerMinute = 1.0;
    public static final double minFare = 5.0;

    double distance;
    int time;

    public CabInvoiceGenerator(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }

    public double calculateFare(){

       double fare = (this.distance * costPerKilometer) + (this.time*costPerMinute);
       if(fare < 5){
           return minFare;
       }
       return  fare;
    }

    public double calculateTotalFare(Rides r){
        double totalFare=0.0;

        for(CabInvoiceGenerator ride: r.rides){
            totalFare += ride.calculateFare();
        }
        return totalFare;
    }

    public int numberOfRides(Rides r){
        int noOfRides=0;

        for(CabInvoiceGenerator ride: r.rides){
            noOfRides++;
        }
        return noOfRides;
    }

    public double averageFarePerRide(Rides r){
        return this.calculateTotalFare(r)/this.numberOfRides(r);
    }

}

class Rides{

    ArrayList<CabInvoiceGenerator> rides = new ArrayList<>();

    public void addRide(CabInvoiceGenerator cIG){
        this.rides.add(cIG);
    }

}

