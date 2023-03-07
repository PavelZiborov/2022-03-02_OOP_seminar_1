package Seminar01;

public class Truck extends Transport{

    private final String type = "Truck";

    public Truck(String color, int numberOfWheels, int weight, int speed) {
        super(color, 4, weight, speed);
    }

    public Truck() {
        super("Black", 4, 2000, 60);
    }

    @Override
    public String getInfo() {
        return String.format("Type: %s, Color: %s, Wheels: %d, Weight: %d, Speed: %d",
                this.type,
                super.getColor(),
                super.getNumberOfWheels(),
                super.getWeight(),
                super.getSpeed());
    }
}
