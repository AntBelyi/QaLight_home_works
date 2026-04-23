package java_lecture_8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        Student studentAnton = new Student("Anton", "Bilyi", 123);
        Sportsmen sportsmenIvan = new Sportsmen("Ivan", "Ivanov", 10);
        Student studentSemen = new Student("Semen", "Semen", 222);
        Sportsmen sportsmenBogdan = new Sportsmen("Bogdan", "Bogdanov", 11);

        persons.add(studentAnton);
        persons.add(sportsmenIvan);
        persons.add(studentSemen);
        persons.add(sportsmenBogdan);

        System.out.println(persons);
    }

}
