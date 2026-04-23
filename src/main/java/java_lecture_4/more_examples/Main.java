package java_lecture_4.more_examples;

public class Main {

    public static void main(String[] args) {
        Person personAnton = new Person("Anton", "Bilyi", 32, 123);
        Person personJulia = new Person("Julia", "Some surname", 25, 789);
        Person personInga = new Person("Inga", "Just surname");

        String antonName = personAnton.getName();
        String ingaSurname = personInga.getSurname();
        int juliaAge = personJulia.getAge();

        System.out.println(personAnton);
        System.out.println(personJulia);
        System.out.println(personInga);

        System.out.println("------------------------------------------");

        System.out.println(antonName);
        System.out.println(ingaSurname);
        System.out.println(juliaAge);

        personJulia.setAge(-72);
        personAnton.setName("Antoha");
        personInga.setAge(23);
        personInga.setCardId(666);

        System.out.println(personJulia);

        Person[] persons = {personInga, personAnton, personJulia};
    }

}
