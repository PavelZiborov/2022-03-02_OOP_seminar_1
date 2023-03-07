package Seminar01_DZ.Base;

import Seminar01_DZ.Base.Product;

public abstract class Drink extends Product {

    private int volume;
    private static final String type = "Drinks";

    public Drink(String name, double price, int quantity, String measureUnit, int volume) {
        super(name, price, quantity, measureUnit);
        this.volume = volume;
        super.setType(type);
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("| volume=%-15d", volume);
    }
}
