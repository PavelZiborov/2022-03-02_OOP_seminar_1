package Seminar01;

public class Motorcycle extends Transport{
    private final String type = "Motorcycle";

    public Motorcycle(String color, int numberOfWheels, int weight, int speed) {
        super(color, numberOfWheels, weight, speed);
    }

    public Motorcycle(){
        super("Black", 2, 500, 120);
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
