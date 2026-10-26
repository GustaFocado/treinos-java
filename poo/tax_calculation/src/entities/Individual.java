package entities;

public class Individual extends TaxPayer {

    private double healthcareSpending;

    public Individual(String name, Double anualIncom, double healthcareSpending) {
        super(name, anualIncom);
        this.healthcareSpending = healthcareSpending;
    }

    public double getHealthcareSpending() {
        return healthcareSpending;
    }

    public void setHealthcareSpending(double healthcareSpending) {
        this.healthcareSpending = healthcareSpending;
    }

    @Override
    public double tax() {
        double taxRate = getAnualIncom() < 20000.00 ? 0.15 : 0.25;
        return (getAnualIncom() * taxRate) - (healthcareSpending * 0.50);
    }

    

}
