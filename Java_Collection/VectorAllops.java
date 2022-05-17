package Java_Collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorAllops {
    public static void main(String args[]) {
        Vector<String> v1 = new Vector<>();
        v1.add("Iron Man");
        v1.add("Gamora");
        v1.add(2, "Quill");
        System.out.println("vector " + v1);
        Vector<String> avengers = new Vector<>();
        avengers.add("Yondu");
        avengers.addAll(v1);
        System.out.println(avengers);

        // traverse using get() method
        String element = avengers.get(2);
        System.out.println("Element at index 2 is : " + element);

        // traverse using iterator()
        Iterator<String> iterate = avengers.iterator();
        System.out.println("VECTOR : ");
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }
    }
}
/*
 * set() changes an element of the vector
 * size() returns the size of the vector
 * toArray() converts the vector into an array
 * toString() converts the vector into a String
 * contains() searches the vector for specified element and returns a boolean
 * result
 */
