package Java_Collection;

import java.util.Map;
import java.util.TreeMap;

public class Map_TreeMap {
    public static void main(String args[]) {
        // Create Map using tree map
        Map<String, Integer> values = new TreeMap<>();
        // Insert elements to map
        values.put("Second", 2);
        values.put("First", 1);
        System.out.println(values);
        values.replace("First", 11);
        values.replace("Second", 22);
        System.out.println(values);
    }
}
