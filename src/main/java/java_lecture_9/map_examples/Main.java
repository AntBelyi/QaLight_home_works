package java_lecture_9.map_examples;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Person> personsData = new HashMap<>();

        personsData.put("antBil@example.com", new Person("Anton", 32));
        personsData.put("liliya@example.com", new Person("Liliya", 21));
        personsData.put("ivan@example.com", new Person("Ivan", 77));
        personsData.put("3", new Person("Anton", 32));

        System.out.println(personsData);

        for(Map.Entry<String, Person> personEntry : personsData.entrySet()) {
            if (personEntry.getKey().equals("liliya@example.com")) {
                System.out.println("Hello! My name is " + personEntry.getValue().getName() + " and my age is " + personEntry.getValue().getAge());
            }
        }

    }

}
