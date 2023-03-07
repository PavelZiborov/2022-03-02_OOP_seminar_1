package Seminar01_DZ.HygieneItems;

import Seminar01_DZ.Base.HygieneItem;

public class Masks extends HygieneItem {
    private static final String type = "Masks";
    public Masks(String name, double price, int quantity, String measureUnit, int piecesPerPack) {
        super(name, price, quantity, measureUnit, piecesPerPack);
        super.setType(type);
    }
}
