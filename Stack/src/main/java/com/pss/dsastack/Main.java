package com.pss.dsastack;

public class Main {
    public static void main(String[] args) {
        // Create a stack of size 5
        Stack stack = new Stack(5);
        
        // Check initial size
        System.out.println("Initial stack size: " + stack.size());
        
        // Push elements
        System.out.println("\nPushing elements:");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        // Show stack contents and size
        System.out.println("\nAfter pushing elements:");
        stack.show();
        System.out.println("Current stack size: " + stack.size());
        
        // Try to peek
        System.out.println("\nTop element (peek): " + stack.peek());
        
        // Pop two elements
        System.out.println("\nPopping two elements:");
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        
        // Show stack contents and size after popping
        System.out.println("\nAfter popping 2 elements:");
        stack.show();
        System.out.println("Current stack size: " + stack.size());
        
        // Push more elements
        System.out.println("\nPushing more elements:");
        stack.push(50);
        stack.push(60);
        
        // Show final stack state
        System.out.println("\nFinal stack state:");
        stack.show();
        System.out.println("Final stack size: " + stack.size());
        
        // Try to push when stack is full
        System.out.println("\nTrying to push to full stack:");
        stack.push(70);  // This should show stack full message - check once again, not getting any error message
    }
}