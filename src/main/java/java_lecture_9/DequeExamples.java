package java_lecture_9;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExamples {

    public static void main(String[] args) {
        Deque<Integer> dequeCollection = new ArrayDeque<>();
        dequeCollection.addLast(1);
        dequeCollection.addLast(2);
        dequeCollection.addLast(3);
        dequeCollection.addLast(4);
        dequeCollection.addFirst(5);
        dequeCollection.addFirst(6);
        dequeCollection.addFirst(7);

        System.out.println(dequeCollection);

        System.out.println("----------------------------------");

        System.out.println(dequeCollection.removeLast());
        System.out.println(dequeCollection);

    }

}
