package Java_Collection;

import java.util.Map;
import java.util.HashMap;

public class Map_Hashmap {
    public static void main(String args[]) {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        System.out.println("Map : " + numbers);

        // Access keys of the map
        System.out.println("Keyps : " + numbers.keySet());
        // Access values of the map
        System.out.println("Values : " + numbers.values());
        // Access the entire map
        System.out.println("Entries : " + numbers.entrySet());

        // Remove Elements from the map
        int value = numbers.remove("Two");
        System.out.println(value);
    }
}
