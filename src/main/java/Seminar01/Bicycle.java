package Seminar01;

public class Bicycle extends Transport{
    private final String type = "Bicycle";

    public Bicycle(String color, int weight, int speed) {

        super(color, 2, weight, speed);
    }
    public Bicycle(){

        super("Black", 2, 15, 30);
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
