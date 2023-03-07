package Seminar01_DZ.ChildrenProducts;

import Seminar01_DZ.Base.ChildrenProduct;

public class Nipple extends ChildrenProduct {
    private static final String type = "Соски";
    public Nipple(String name, double price, int quantity, String measureUnit, int minimumAge, Boolean hypoallergenic) {
        super(name, price, quantity, measureUnit, minimumAge, hypoallergenic);
        super.setType(type);
        }
}
