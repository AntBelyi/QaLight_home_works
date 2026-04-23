package java_lecture_3.methods;

public class Overloading {

    public static void main(String[] args) {
//        String sayHelloResult = sayHello("Anton");
//        System.out.println(sayHelloResult);
//        System.out.println(sayHello("Anton", 32));

        sayHello("Anton", 32);
    }

    public static String sayHello(String name) {
        String resultValue = "Hello my dear friend " + name;
        return resultValue;
    }

    public static String sayHello(String name, int age) {
        String resultValue = "Just hello " + name + "-" + age;
        return resultValue;
    }

}
