package java_lecture_9;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExamples {

    public static void main(String[] args) {
        Queue<String> queueCollection = new ArrayDeque<>();

        queueCollection.offer("One");
        queueCollection.offer("Two");
        queueCollection.offer("Three");
        queueCollection.offer("Four");
        queueCollection.offer("Five");

        System.out.println(queueCollection);

        System.out.println("---------------------------------------------------------------");

        String element = queueCollection.peek();
        System.out.println(element);
        System.out.println(queueCollection);

        System.out.println(queueCollection.size());
    }

}
