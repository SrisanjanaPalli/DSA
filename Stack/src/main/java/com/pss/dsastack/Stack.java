package com.pss.dsastack;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Add an element to the top of the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        stackArray[++top] = value;
    }

    // Pop method to remove and return the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        }
        return stackArray[top--];
    }

    // Peek method to return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
        return stackArray[top];
    }

    // Helper method to check if stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Helper method to check if stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Method to display all elements in the stack
    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack elements from bottom to top:");
        for (int i = 0; i <= top; i++) {
            System.out.println(stackArray[i]);
        }
    }

    // Method to return the current size of the stack
    public int size() {
        return top + 1;
    }
}