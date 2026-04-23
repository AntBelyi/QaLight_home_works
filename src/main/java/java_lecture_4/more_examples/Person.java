package java_lecture_4.more_examples;

public class Person {

    private String name;
    private String surname;
    private int age;
    private int cardId;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, int cardId) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.cardId = cardId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return "this.surname";
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return 6;
    }

    public void setAge(int age) {
        if(age < 0) {
            System.out.println("You've entered incorrect age value. It can't be less than zero");
            return;
        }
        this.age = age;
    }

    public int getCardId() {
        return this.cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", cardId=" + cardId +
                '}';
    }
}
