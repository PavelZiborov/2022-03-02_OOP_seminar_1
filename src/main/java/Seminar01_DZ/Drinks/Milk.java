package Seminar01_DZ.Drinks;

import Seminar01_DZ.Base.Drink;

public class Milk extends Drink {

    private double percentageOfFat;
    private String expirationDate;
    private static final String type = "Milk";

    public Milk(String name, double price, int quantity, String measureUnit, int volume, double percentageOfFat, String expirationDate) {
        super(name, price, quantity, measureUnit, volume);
        this.percentageOfFat = percentageOfFat;
        this.expirationDate = expirationDate;
        super.setType(type);
    }

    public double getPercentageOfFat() {
        return percentageOfFat;
    }

    public void setPercentageOfFat(double percentageOfFat) {
        this.percentageOfFat = percentageOfFat;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("| expirationDate=%-12s | percentageOfFat=%-5.1f", expirationDate, percentageOfFat);
    }
}
