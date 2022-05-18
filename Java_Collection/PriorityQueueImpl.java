package Java_Collection;

import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueImpl {
    public static void main(String args[]) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(7);
        numbers.add(4);
        numbers.add(3);
        numbers.add(9);

        System.out.println("PriorityQueue " + numbers);
        numbers.offer(1);
        System.out.println("Updated priority Queue " + numbers);
        // peek() method returns head element
        int number = numbers.peek();
        System.out.println(number);

        // reomove() - removes the entered element
        boolean result1 = numbers.remove(3);
        System.out.println("Remove" + result1);

        // poll() - deletes the elements from the head
        int result = numbers.poll();
        System.out.println("POLL" + result);
        System.out.println(numbers);

        numbers.add(5);
        numbers.add(6);
        numbers.add(23);
        numbers.add(72);
        // using iterator

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
//contains() search for the specific element and returns trur or false on the basis of result
//size() lenght of priorityqueue
//toArray() converts a priority queue to an array and returns it

