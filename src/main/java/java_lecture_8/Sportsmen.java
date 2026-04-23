package java_lecture_8;

public class Sportsmen extends Person {

    private int speedOfRun;

    public Sportsmen(String name, String surname, int speedOfRun) {
        super(name, surname);
        this.speedOfRun = speedOfRun;
    }

    public int getSpeedOfRun() {
        return speedOfRun;
    }

    public void setSpeedOfRun(int speedOfRun) {
        this.speedOfRun = speedOfRun;
    }

    @Override
    public String toString() {
        return "Sportsmen{" +
                "speedOfRun=" + speedOfRun +
                '}';
    }
}
