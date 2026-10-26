package entities;

public abstract class TaxPayer {

    private String name;
    private Double anualIncome;

    public TaxPayer() {
    }

    public TaxPayer(String name, Double anualIncom) {
        this.name = name;
        this.anualIncome = anualIncom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncom() {
        return anualIncome;
    }

    public void setAnualIncom(Double anualIncom) {
        this.anualIncome = anualIncom;
    }

    public abstract double tax();

}
