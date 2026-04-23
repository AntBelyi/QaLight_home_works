package java_lecture_6;

public abstract class VehicleWithEngine {

    private String name;
    private String speedOfRun;

    public VehicleWithEngine(String name, String speedOfRun) {
        this.name = name;
        this.speedOfRun = speedOfRun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeedOfRun() {
        return speedOfRun;
    }

    public void setSpeedOfRun(String speedOfRun) {
        this.speedOfRun = speedOfRun;
    }

    public void sayHello() {
        System.out.println("Hello my name is: " + this.name);
    }

    public abstract void moveUsingEngine();

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", speedOfRun='" + speedOfRun + '\'' +
                '}';
    }
}
