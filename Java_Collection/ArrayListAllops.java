package Java_Collection;

//Insert | Update | Delete | Traverse operations in array list
import java.util.ArrayList;

public class ArrayListAllops {
    public static void main(String args[]) {
        ArrayList<String> a1 = new ArrayList<String>();
        // insertion
        a1.add("Iron Man");
        a1.add("Captain America");
        a1.add("Hockey");
        a1.add("War Matchine");
        System.out.println(a1);

        // traverse using for each loop

        for (String elements : a1) {
            System.out.println(elements);
        }
        String str = a1.get(1);
        System.out.println(str);

        // update
        a1.set(1, "Captain Marvel");
        System.out.println(a1);

        // delete
        String str1 = a1.remove(0);
        System.out.println(str1 + " removed");
        System.out.println(a1);

    }
}
/*
 * size() Returns the length of the arraylist.
 * sort() Sort the arraylist elements.
 * clone() Creates a new arraylist with the same element, size, and capacity.
 * contains() Searches the arraylist for the specified element and returns a
 * boolean result.
 * 
 * ensureCapacity() Specifies the total element the arraylist can contain.
 * isEmpty() Checks if the arraylist is empty.
 * indexOf() Searches a specified element in an arraylist and returns the index
 * of the element.
 */