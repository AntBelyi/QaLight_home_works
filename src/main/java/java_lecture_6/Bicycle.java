package java_lecture_6;

public class Bicycle extends VehicleWithEngine {
    private int countOfLights;

    public Bicycle(String name, String speedOfRun, int countOfLights) {
        super(name, speedOfRun);
        this.countOfLights = countOfLights;
    }

    public int getCountOfLights() {
        return countOfLights;
    }

    public void setCountOfLights(int countOfLights) {
        this.countOfLights = countOfLights;
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("I have <" + this.countOfLights + "> lights");
    }

    @Override
    public void moveUsingEngine() {
        System.out.println("I cam move using owner foots");
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "name='" + getName() + '\'' +
                ", speedOfRun='" + getSpeedOfRun() + '\'' +
                ", countOfLights=" + countOfLights +
                '}';
    }
}
