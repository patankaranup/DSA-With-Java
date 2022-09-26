import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Stack => LIFO (Last in First Out)
        Stack<String> stack = new Stack<String>();
        // System.out.println(stack.isEmpty());
        stack.push("Minecaraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("FFVII");
        stack.push("Borderlands");
        // System.out.println(stack.isEmpty());
        // System.out.println(stack);
        // System.out.println(stack.pop());
        System.out.println(stack);
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // System.out.println(stack.peek());
        // System.out.println(stack.search("Borderlands"));
        // for (int i = 0; i <= 1000000000; i++) {
        // stack.push("Skyrim");
        // }

        // Uses of stacks?
        // 1. Undo / Redo features in text editor
        // 2. Moving back and forward through browser history
        // 3. backtracking ALgorithm (maze, file directories)
        // 4. calling functions (cal stack)
    }
}
