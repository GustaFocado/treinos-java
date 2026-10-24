package entities;

import java.time.LocalDate;

public class UsedProduct extends Product {

    private LocalDate manufacturDate;

    public UsedProduct() {
    }

    public UsedProduct(String name, double price, LocalDate manufacturDate) {
        super(name, price);
        this.manufacturDate = manufacturDate;
    }

    public LocalDate getManufacturDate() {
        return manufacturDate;
    }

    public void setManufacturDate(LocalDate manufacturDate) {
        this.manufacturDate = manufacturDate;
    }

    @Override
    public final String priceTag() {
        return super.getName() + " $ " + String.format("%.2f", super.getPrice());
    }

}
