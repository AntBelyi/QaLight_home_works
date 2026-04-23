package java_lecture_6;

public class Car extends VehicleWithEngine {
    private int countOfWheels;

    public Car(String name, String speedOfRun, int countOfWheels) {
        super(name, speedOfRun);
        this.countOfWheels = countOfWheels;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public void setCountOfWheels(int countOfWheels) {
        this.countOfWheels = countOfWheels;
    }

    @Override
    public void moveUsingEngine() {
        System.out.println("I can move using simple car engine");
    }

    public void increaseCarPower() {
        System.out.println("The power i increased");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + getName() + '\'' +
                ", speedOfRun='" + getSpeedOfRun() + '\'' +
                ", countOfWheels=" + countOfWheels +
                '}';
    }
}
