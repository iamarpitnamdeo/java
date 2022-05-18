package Java_Collection;

import java.util.Stack;

public class StackAllOps {
    public static void main(String args[]) {
        Stack<String> s1 = new Stack<>();
        // push() method is used to insert the elements into the stack
        s1.push("THOR");
        s1.push("Lokey");
        s1.push("Odin");
        s1.push("Valkerey");

        System.out.println(s1);
        // pop() method used to remove elements from the stack

        String de = s1.pop();
        System.out.println(de);
        System.out.println(s1);

        String top = s1.peek();
        System.out.println(top);

        int position = s1.search("Odin");
        System.out.println(position);

        boolean result = s1.empty();
        System.out.println("Is the stack empty? " + result);
    }
}
/*
 * The Stack class provides the direct implementation of the stack data
 * structure. However, it is recommended not to use it. Instead, use the
 * ArrayDeque class
 * (implements the Deque interface) to implement the stack data structure in
 * Java.
 */
