package Java_Collection;

import java.util.HashMap;

public class HashMapAllOps {
    public static void main(String args[]) {
        HashMap<String, Integer> numbers = new HashMap<>();
        System.out.println("Initial HashMap :" + numbers);
        // Insert values
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap " + numbers);
        // access
        System.out.println(numbers.get("Two"));
        System.out.println(numbers.keySet());
        System.out.println(numbers.values());
        System.out.println(numbers.entrySet());
        // update
        numbers.replace("Three", 33);
        System.out.println(numbers);
        // delete
        numbers.remove("Two");
        System.out.println(numbers);
    }
}
