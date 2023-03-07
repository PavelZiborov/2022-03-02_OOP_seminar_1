package Seminar01_DZ.FoodProducts;

import Seminar01_DZ.Base.FoodProduct;

public class Bread extends FoodProduct {
    private static final String type = "Bread";
    private String typeOfFlour;

    public Bread(String name, double price, int quantity, String measureUnit, String expirationDate, String typeOfFlour) {
        super(name, price, quantity, measureUnit, expirationDate);
        this.typeOfFlour = typeOfFlour;
        super.setType(type);
    }

    public String getTypeOfFlour() {
        return typeOfFlour;
    }

    public void setTypeOfFlour(String typeOfFlour) {
        this.typeOfFlour = typeOfFlour;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("| typeOfFlour=%-10s", typeOfFlour);
    }
}
