package model.entities;

import java.util.Date;

public class CarRental {

    private Date start;
    private Date end;
    private Double pricePerDay;
    private Double pricePerHour;

    public CarRental(Date start, Date end,
            Double pricePerDay, Double pricePerHour) {
        this.start = start;
        this.end = end;
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public double calculatePricePerHour() {
        long durationInMilliseconds = end.getTime() - start.getTime();
        long hours = (long) Math.ceil(durationInMilliseconds / (1000.0 * 60 * 60));

        return hours * pricePerHour;
    }

    public double calculatePricePerDay() {
        long durationInMilliseconds = end.getTime() - start.getTime();
        long days = (long) Math.ceil(durationInMilliseconds / (1000.0 * 60 * 60 * 24));

        return days * pricePerDay;
    }

    public double calculateTotalPrice() {
        long durationInMilliseconds = end.getTime() - start.getTime();
        double hours = durationInMilliseconds / (1000.0 * 60 * 60);

        if (hours <= 12.0) {
            return calculatePricePerHour();
        } else {
            return calculatePricePerDay();
        }
    }

}
