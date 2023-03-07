package Seminar01_DZ.ChildrenProducts;

import Seminar01_DZ.Base.ChildrenProduct;

public class Diapers extends ChildrenProduct {
    private int size;
    private int minimalWeight;
    private int maximalWeight;
    private String typeOfDiapers;
    private static final String type = "Подгузники";

    public Diapers(String name, double price, int quantity, String measureUnit, int minimumAge, Boolean hypoallergenic, int size, int minimalWeight, int maximalWeight, String typeOfDiapers) {
        super(name, price, quantity, measureUnit, minimumAge, hypoallergenic);
        this.size = size;
        this.minimalWeight = minimalWeight;
        this.maximalWeight = maximalWeight;
        this.typeOfDiapers = typeOfDiapers;
        super.setType(type);
        }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMinimalWeight() {
        return minimalWeight;
    }

    public void setMinimalWeight(int minimalWeight) {
        this.minimalWeight = minimalWeight;
    }

    public int getMaximalWeight() {
        return maximalWeight;
    }

    public void setMaximalWeight(int maximalWeight) {
        this.maximalWeight = maximalWeight;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("| size=%-5d| minimalWeight=%-8d| maximalWeight=%-8d| typeOfDiapers=%-8s",
                size, minimalWeight, maximalWeight,typeOfDiapers);
    }
}
