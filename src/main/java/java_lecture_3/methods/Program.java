package java_lecture_3.methods;

public class Program {

    public static void main(String[] args) {
//        sum(3, 7);
//        sum(2, 89);
//        sum(11, -7);
//
//        int resultValue = sumWithReturn(4, 7, 9);
//        System.out.println(resultValue);

//        System.out.println(dayTime(13));
//        System.out.println(dayTime(22));
        divide(8, 0);
        System.out.println("App is finished");
    }

    public static String dayTime(int dayTimeValue) {
        if(dayTimeValue > 24 || dayTimeValue < 0) {
            return "Invalid value";
        } else if (dayTimeValue > 21 || dayTimeValue < 5) {
            return "Good night";
        } else if (dayTimeValue >= 15) {
            return "Good evening";
        } else if (dayTimeValue >= 11) {
            return "Good after noon";
        } else {
            return "Good morning";
        }
    }

    public static void sayHello(String name, int age, String surname) {
        System.out.println("Hello " + name + " " + surname + ". I know you're " + age + " years old");
    }

    public static void sum(int firstValue, int secondValue) {
        int result = firstValue + secondValue;
        System.out.println(result);
    }

    public static int sumWithReturn(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    public static void divide(int a, int b) {
        if(b == 0) {
            System.out.println("You've entered incorrect value - <" + b + ">");
            return;
        }
        int result = a / b;
        System.out.println(result);
    }

}
