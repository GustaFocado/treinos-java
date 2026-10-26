package entities;

public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company(String name, Double anualIncom, int numberOfEmployees) {
        super(name, anualIncom);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double taxRate = numberOfEmployees > 10 ? 0.14 : 0.16;
        return getAnualIncom() * taxRate;
    }

}
