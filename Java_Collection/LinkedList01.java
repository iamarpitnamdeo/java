package Java_Collection;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String args[]) {
        LinkedList<String> list1 = new LinkedList<>();
        // add method without the index parameter
        list1.add("Dog");
        list1.add("Cat");
        list1.add("Cow");
        System.out.println("Linked List: " + list1);
        // add method with index parameter
        list1.add(1, "Horse");
        list1.set(2, "Elephant");
        System.out.println("Linked List: " + list1);
    }
}
