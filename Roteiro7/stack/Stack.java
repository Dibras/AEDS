package stack;

import java.io.*;
import java.util.*;

public class Stack<E> extends Vector<E> {

    Stack<E> stack = new Stack<E>();

    //colocando o elemento no topo
    static void stack_push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    static void stack_pop(Stack<Integer> stack) {
        System.out.println("Pop Operacaoo: ");
        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    //Exibindo o elemento no topo
    static void stack_peeks(Stack<Integer> stack) {
        Integer elemento = (Integer) stack.peek();
        System.out.println("Elemento no topo: " + elemento);
    }

    //procurando elemento
    static void stack_search(Stack<Integer> stack, int elemento) {
        Integer pos = (Integer) stack.search(elemento);
        if (pos == -1) {
            System.out.println("Elemento nao encontrado!");
        } else {
            System.out.println("Elemento encontrado na posicao" + pos);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack_push(stack);
        stack_pop(stack);
        stack_peeks(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);
    }
}
