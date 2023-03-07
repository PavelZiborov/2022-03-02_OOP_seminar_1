package Seminar01_DZ.HygieneItems;

import Seminar01_DZ.Base.HygieneItem;

public class ToiletPaper extends HygieneItem {
    private int numberOfLayers;
    private static final String type = "Туалетная бумага";

    public ToiletPaper(String name, double price, int quantity, String measureUnit, int piecesPerPack, int numberOfLayers) {
        super(name, price, quantity, measureUnit, piecesPerPack);
        this.numberOfLayers = numberOfLayers;
        super.setType(type);

    }
    public ToiletPaper(String name, double price, int quantity, String measureUnit, int numberOfLayers) {
        super(name, price, quantity, measureUnit);
        this.numberOfLayers = numberOfLayers;
        super.piecesPerPack = 1;
        super.setType(type);
    }
    public ToiletPaper(String name, double price, int quantity, String measureUnit) {
        super(name, price, quantity, measureUnit);
        super.piecesPerPack = 1;
        this.numberOfLayers = 1;
        super.setType(type);
    }

    public int getNumberOfLayers() {
        return numberOfLayers;
    }

    public void setNumberOfLayers(int numberOfLayers) {
        this.numberOfLayers = numberOfLayers;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("| numberOfLayers=%-15d", numberOfLayers);
    }
}
