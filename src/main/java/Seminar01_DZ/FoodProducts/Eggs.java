package Seminar01_DZ.FoodProducts;

import Seminar01_DZ.Base.FoodProduct;

public class Eggs extends FoodProduct {
    private static final String type = "Eggs";
    private int quantityInPackage;
    public Eggs(String name, double price, int quantity, String measureUnit, String expirationDate, int quantityInPackage) {
        super(name, price, quantity, measureUnit, expirationDate);
        this.quantityInPackage = quantityInPackage;
        super.setType(type);
    }

    public int getQuantityInPackage() {
        return quantityInPackage;
    }

    public void setQuantityInPackage(int quantityInPackage) {
        this.quantityInPackage = quantityInPackage;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("| quantityInPackage=%-10s", quantityInPackage);
    }
}
