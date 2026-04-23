package java_lecture_3.arrays;


import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        int[] arrayOfDigits = {-3, 5, 0, 4, 8, -11, 7, 4, 1, 5, 1, 7, 137};

//        for(int i = 0; i < arrayOfDigits.length; i++) {
//            if(arrayOfDigits[i] > 0) {
//                System.out.println(arrayOfDigits[i]);
//            }
//            System.out.println("Hello Vika!");
//        }
//
//        System.out.println("Just Hello!");

        System.out.println(Arrays.toString(arrayOfDigits));

        arrayOfDigits[5] = 35;

        System.out.println(Arrays.toString(arrayOfDigits));

    }

}
