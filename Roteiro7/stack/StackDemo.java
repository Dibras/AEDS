package stack;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        //Default initialization of Stack
        Stack stack1 = new Stack();

        //Iniciando o Stack usando genericos
        Stack<String> stack2 = new Stack<String>();

        //empurrando elementos
        stack.push(4);
        stack1.push("All");
        stack1.push("Geek");

        stack2.push("Geeks");
        stack2.push("For");
        stack2.push("Geeks");

        //printing elementos
        System.out.println(stack1);
        System.out.println(stack2);

        //acessando os elementos
        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);

        // Fetching the element at the head of the Stack
        System.out.println("The element at the top of the"
                + " stack is: " + stack.peek());

        // Displaying the Stack after the Operation
        System.out.println("Final Stack: " + stack);

        //Removendo os elementos
        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);

        // Removing elements using pop() method
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation " + stack);

    }

}
