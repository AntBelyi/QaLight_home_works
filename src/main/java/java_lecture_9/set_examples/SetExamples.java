package java_lecture_9.set_examples;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {

    public static void main(String[] args) {
        Set<Person> personsSet = new HashSet<>();

        Person firstPerson = new Person("Anton", 32);
        Person secobdPerson = new Person("Liliya", 21);
        Person thirdPerson = new Person("Ivan", 77);
        Person fourthPerson = new Person("Anton", 32);
        Person fifthPerson = new Person("Liliya", 21);

        personsSet.add(firstPerson);
        personsSet.add(secobdPerson);
        personsSet.add(thirdPerson);
        personsSet.add(fourthPerson);
        personsSet.add(fifthPerson);

        System.out.println(personsSet);

        for(Person person : personsSet) {
            System.out.println(person);
        }

    }

}
