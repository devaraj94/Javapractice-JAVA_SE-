import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListPerformanceExample {
    public static void main(String[] args) {
        // Create an ArrayList and a LinkedList with 100000 random integers
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            int value = random.nextInt();
            arrayList.add(value);
            linkedList.add(value);
        }

        // Measure the time to retrieve an element at a random index in both lists
        long startTime = System.nanoTime();
        int arrayListValue = arrayList.get(random.nextInt(100000));
        long arrayListTime = System.nanoTime() - startTime;
        startTime = System.nanoTime();
        int linkedListValue = linkedList.get(random.nextInt(100000));
        long linkedListTime = System.nanoTime() - startTime;
        System.out.println("Retrieving random element: ");
        System.out.println("ArrayList time: " + arrayListTime + " ns");
        System.out.println("LinkedList time: " + linkedListTime + " ns");

        // Measure the time to insert an element at a random index in both lists
        startTime = System.nanoTime();
        arrayList.add(random.nextInt(100000), random.nextInt());
        arrayListTime = System.nanoTime() - startTime;
        startTime = System.nanoTime();
        linkedList.add(random.nextInt(100000), random.nextInt());
        linkedListTime = System.nanoTime() - startTime;
        System.out.println("Inserting random element: ");
        System.out.println("ArrayList time: " + arrayListTime + " ns");
        System.out.println("LinkedList time: " + linkedListTime + " ns");
    }
}
