package java_lecture_6;

public class Boat extends VehicleWithEngine {

    private String countOfFloors;

    public Boat(String name, String speedOfRun, String countOfFloors) {
        super(name, speedOfRun);
        this.countOfFloors = countOfFloors;
    }

    public String getCountOfFloors() {
        return countOfFloors;
    }

    public void setCountOfFloors(String countOfFloors) {
        this.countOfFloors = countOfFloors;
    }

    @Override
    public void moveUsingEngine() {
        System.out.println("I can move using special water engine");
    }

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + getName() + '\'' +
                ", speedOfRun='" + getSpeedOfRun() + '\'' +
                ", countOfFloors='" + countOfFloors + '\'' +
                '}';
    }
}
