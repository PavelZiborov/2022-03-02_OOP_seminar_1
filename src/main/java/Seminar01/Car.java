package Seminar01;

public class Car extends Transport{
    private final String type = "Car";

    public Car(String color, int numberOfWheels, int weight, int speed) {
        super(color, numberOfWheels, weight, speed);
    }
    public Car(){
        super("Black", 4, 1000, 100);
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
