package java_lecture_5.real_inheritance;

public class Program {

    public static void main(String[] args) {
        Sportsmen sportsmen = new Sportsmen("Julia", "Just Julia", 23, 100);
        Student student = new Student("Lilia", "Just Lilia", 23, "9379992");

        System.out.println(sportsmen);
        System.out.println(student);

        System.out.println(student.getName());
        System.out.println(sportsmen.getSurname());

        sportsmen.move();
        student.move();

        sportsmen.sayHello();
        student.sayHello();
    }

}
