package Seminar01_DZ.Base;

public abstract class Product {
    private String type = "Product";
    private String name;
    private double price;
    private int quantity;
    private String measureUnit;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("| type=%-20s| name=%-15s| price=%-8.2f| quantity=%-5d| measureUnit=%-8s",
                type, name, price, quantity, measureUnit);
    }

    public Product(String name, double price, int quantity, String measureUnit){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.measureUnit = measureUnit;
    }
}
