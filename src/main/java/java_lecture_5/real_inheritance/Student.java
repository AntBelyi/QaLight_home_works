package java_lecture_5.real_inheritance;

public class Student extends Person {

    private String studentCardId;

    public Student(String name, String surname, int age, String studentCardId) {
        super(name, surname, age);
        this.studentCardId = studentCardId;
    }

    public String getStudentCardId() {
        return studentCardId;
    }

    public void setStudentCardId(String studentCardId) {
        this.studentCardId = studentCardId;
    }

    @Override
    public void move() {
        System.out.println("I go for a walk");
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("And probably that's it");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", studentCardId='" + studentCardId + '\'' +
                '}';
    }
}
