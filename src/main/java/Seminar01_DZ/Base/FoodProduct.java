package Seminar01_DZ.Base;

import Seminar01_DZ.Base.Product;

public abstract class FoodProduct extends Product {

    private String expirationDate;
    private static final String type = "FoodProducts";

    public FoodProduct(String name, double price, int quantity, String measureUnit, String expirationDate) {
        super(name, price, quantity, measureUnit);
        this.expirationDate = expirationDate;

        super.setType(type);
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("| expirationDate=%-12s", expirationDate);
    }
}
