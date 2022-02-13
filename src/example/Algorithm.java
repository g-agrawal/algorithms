package example;

import java.util.Stack;

public class Algorithm {
    public void nextGreater(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < array.length; i++) {
            while(!stack.isEmpty() && array[i] > stack.peek()) {
                System.out.println(stack.pop() + " -> " + array[i]);
            }
            stack.push(array[i]);
        }
        while(!stack.isEmpty()) {
            System.out.println(stack.pop() + " -> -1 ");
        }
    }
}
