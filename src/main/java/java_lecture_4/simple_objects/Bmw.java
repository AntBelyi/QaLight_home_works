package java_lecture_4.simple_objects;

public class Bmw {

    public String name = "BMW!!!";
    public int speed = 320;
    public int cost = 1500;
    public int countOfWheels = 4;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", cost=" + cost +
                ", countOfWheels=" + countOfWheels +
                '}';
    }

}
