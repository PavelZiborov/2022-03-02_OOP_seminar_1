package Seminar01;

public class Transport {


    enum State{
        On, Off
    }
    protected State state;

    // цвет, модель, количество колёс, вес и скорость а так же метод ехать.
    private String color;
    private int numberOfWheels;
    private int weight;
    private int speed;


    @Override
    public String toString() {
        return getInfo();
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getInfo(){
        return String.format("Color: %s, Wheels: %d, Weight: %d, Speed: %d", this.color, this.numberOfWheels, this.weight, this.speed);
    }

    public Transport(String color, int numberOfWheels, int weight, int speed) {
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.weight = weight;
        this.speed = speed;
        this.state = State.Off;
    }


    public void move() {
        if (this.state == State.Off) {
            System.out.println("START!");
            this.state = State.On;
        }

    }

    public void stop() {
        if (this.state != State.Off) {
            System.out.println("STOP!");
            this.state = State.Off;
        }
    }
}