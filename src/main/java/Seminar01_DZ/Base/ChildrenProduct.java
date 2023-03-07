package Seminar01_DZ.Base;

import Seminar01_DZ.Base.Product;

public abstract class ChildrenProduct extends Product {
    private static final String type = "ChildrenProducts";
    private int minimumAge;
    private Boolean hypoallergenic;

    public ChildrenProduct(String name, double price, int quantity, String measureUnit, int minimumAge, Boolean hypoallergenic) {
        super(name, price, quantity, measureUnit);
        this.minimumAge = minimumAge;
        this.hypoallergenic = hypoallergenic;
        super.setType(type);
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public Boolean getHypoallergenic() {
        return hypoallergenic;
    }

    public void setHypoallergenic(Boolean hypoallergenic) {
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("| minimumAge=%-7d | hypoallergenic=%-5s", minimumAge, hypoallergenic);
    }
}
