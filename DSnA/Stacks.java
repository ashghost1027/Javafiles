package DSnA;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        // stack = LIFO data structure. stores object into a "vertical tower structure".
        // push() to add to the top
        // pop() to remove from the top.

        Stack<String> stack = new Stack<String>();
        stack.push("Lateral delt");
        stack.push("Rear delt");
        stack.push("Front delt");
        stack.push("Latissmus Dorsi");
        stack.push("Trapezius");
        stack.push("Triceps");

        System.out.println(stack);
        String top = stack.pop();
        System.out.println(top);
        String tops = stack.peek();
        System.out.println(tops);
        System.out.println(stack.search("Front delt"));

        // Can run out of memory.
        // Used for undo/redo features.
        // Moving back/forth browsers tabs.
        // backtracking algorithms.
        // Calling functions (call stack).
    }
}
