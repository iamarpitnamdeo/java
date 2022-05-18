package Java_Collection;

import java.util.Set;
import java.util.HashSet;

public class Set_HashSet_Impl {
    public static void main(String args[]) {
        // Creating a set using the HashSet class
        Set<Integer> set1 = new HashSet<>();

        // Add elements to the set1
        set1.add(3);
        set1.add(2);
        set1.add(2);
        System.out.println("Set1 " + set1);

        // creating another set using the HashSet class
        Set<Integer> set2 = new HashSet<>();

        // Add elements
        set2.add(4);
        set2.add(7);
        System.out.println("Set2 " + set2);

        // union of two sets
        set2.addAll(set1);
        System.out.println("Union is :" + set2);

    }
}
