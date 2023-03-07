package Seminar01_DZ.Base;

import Seminar01_DZ.Base.Product;

public abstract class HygieneItem extends Product {

    protected int piecesPerPack;
    private static final String type = "HygieneItems";

    public HygieneItem(String name, double price, int quantity, String measureUnit, int piecesPerPack) {
        super(name, price, quantity, measureUnit);
        super.setType(type);
        this.piecesPerPack = piecesPerPack;
    }

    public HygieneItem(String name, double price, int quantity, String measureUnit) {
        super(name, price, quantity, measureUnit);
        super.setType(type);
        this.piecesPerPack = 1;
    }

    public int getPiecesPerPack() {
        return piecesPerPack;
    }

    public void setPiecesPerPack(int piecesPerPack) {
        this.piecesPerPack = piecesPerPack;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("| piecesPerPack=%-5d", piecesPerPack);
    }
}
