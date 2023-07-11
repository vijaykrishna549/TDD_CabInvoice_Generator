package com.cab_invoice;
public class InvoiceSummary {
    private final int numberOFRides;
    private final double totalFare;
    private final Object averageFare;

    public InvoiceSummary(int numberOFRides, double totalFare)
    {
        this.numberOFRides = numberOFRides;
        this.totalFare = totalFare;
        this.averageFare = this.totalFare/this.numberOFRides;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary summary = (InvoiceSummary) o;
        return numberOFRides == summary.numberOFRides && Double.compare(summary.totalFare, totalFare) == 0 && averageFare.equals(summary.averageFare);
    }

   /* @Override
    public int hashCode() {
        return 0;
    }*/
}
