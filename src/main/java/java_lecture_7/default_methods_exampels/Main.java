package java_lecture_7.default_methods_exampels;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5, 9));

        System.out.println(calculator.sum(3, 8, 9));

    }

}
