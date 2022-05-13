package Java_Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx01 {
    public static void main(String args[]) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Tony Stark");
        names.add("Thor Ragnarock");
        names.add("Natasha Romanoff");
        names.add(3, "Cobie Smlunders");
        System.out.println(names);
        // access element from list
        String str = names.get(3);
        System.out.println(str);

        int str2 = names.indexOf(2);
        System.out.println(str2);

        String str3 = names.remove(3);
        System.out.println("Removed Element " + str3);
        System.out.println(names);

        names.addFirst("Clint Barerter");
        names.addLast("Vision");
        names.addFirst("Rody");
        System.out.println(names);
    }
}
