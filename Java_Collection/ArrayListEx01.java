package Java_Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {
    public static void main(String args[]) {
        // creating list using ArrayList
        List<Integer> l1 = new ArrayList<>();
        // add elements to the list
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println("List is : " + l1);

        int numbers = l1.get(1);
        System.out.println("element of second position is " + numbers);

        int removedNumber = l1.remove(2);
        System.out.println("Removed element " + removedNumber);
        System.out.println("Now List is : " + l1);
    }
}
