package java_lecture_2;

public class IfElseConstructions {

    public static void main(String[] args) {

        int personAge = 0;

        if(personAge <= 0) {
            System.out.println("You've entered incorrect age value");
        } else if(personAge > 0 && personAge < 18) {
            System.out.println("Hello, you can buy only milk!");
        } else if (personAge >= 18 && personAge < 70) {
            System.out.println("Hello sir. You can buy some alcohol!");
        } else {
            System.out.println("You can buy only medicine!");
        }

    }

}
