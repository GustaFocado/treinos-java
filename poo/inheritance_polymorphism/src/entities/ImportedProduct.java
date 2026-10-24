package entities;

public class ImportedProduct extends Product {

    private double customsFree;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, double price, double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }

    public double getCustomsFree() {
        return customsFree;
    }

    public void setCustomsFree(double customsFree) {
        this.customsFree = customsFree;
    }

    public double totalPrice() {
        return getPrice() + customsFree;
    }

    @Override
    public final String priceTag() {
        return super.getName() + " $ " + String.format("%.2f", super.getPrice());
    }
}
