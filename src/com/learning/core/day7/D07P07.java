package com.learning.core.day7;

import java.util.Stack;

public class D07P07 {
    public static boolean isTopEven(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return false;
        }
        int top = stack.peek();
        return top % 2 == 0;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(15);
        stack.push(25);
        stack.push(30);
        stack.push(40);

        boolean result = isTopEven(stack);
        System.out.println(result);
    }
}


