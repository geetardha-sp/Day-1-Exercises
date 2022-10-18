package com.sechpoint;

public class Main {
    public static void main (String[] args) {
        Stack stack = new Stack(3);
 
        stack.push(1);
        stack.push(2);
 
        stack.pop();
        stack.pop();
 
        stack.push(3);
 
        System.out.println("The top element is " + stack.peek());
        System.out.println("The stack size is " + stack.size());
 
        stack.pop();
 
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}
