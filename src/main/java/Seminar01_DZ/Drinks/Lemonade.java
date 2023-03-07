package Seminar01_DZ.Drinks;

import Seminar01_DZ.Base.Drink;

public class Lemonade extends Drink {
    private static final String type = "Lemonade";
    public Lemonade(String name, double price, int quantity, String measureUnit, int volume) {
        super(name, price, quantity, measureUnit, volume);
        super.setType(type);
    }

}
