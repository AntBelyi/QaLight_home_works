package java_lecture_5.real_inheritance;

public class Sportsmen extends Person {

    private int speedOfRun;

    public Sportsmen(String name, String surname, int age, int speedOfRun) {
        super(name, surname, age);
        this.speedOfRun = speedOfRun;
    }

    public int getSpeedOfRun() {
        return speedOfRun;
    }

    public void setSpeedOfRun(int speedOfRun) {
        this.speedOfRun = speedOfRun;
    }

    @Override
    public void move() {
        System.out.println("Hello my name is " + this.getName() + " and I'm running");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello I'm really happy to see you and you can cal me my princes " + this.getName());
    }

    @Override
    public String toString() {
        return "Sportsmen{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", speedOfRun=" + speedOfRun +
                '}';
    }
}
