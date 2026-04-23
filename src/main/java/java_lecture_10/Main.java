package java_lecture_10;

public class Main {

    public static void main(String[] args) {
        Person ivan = new Person("Ivan", 39);
        System.out.println(ivan);

        ivan.setAge(-32);

        System.out.println(ivan);
    }

}
