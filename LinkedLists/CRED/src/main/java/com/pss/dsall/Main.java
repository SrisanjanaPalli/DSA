package com.pss.dsall;


public class Main {
    public static void main(String[] args) {

        System.out.println("===Single Linked List===");
        SingleLinked ll = new SingleLinked();
        ll.insert(2);
        ll.insert(4);
        ll.insert(3);
        ll.show();
        System.out.println("--Insertion--");
        ll.insertAt(1, 9);
        ll.insertAt(3, 9);
        ll.show();
        System.out.println("--Deletion--");
        ll.deleteAt(6);
        ll.show();
        System.out.println("--Searching--");
        ll.searchKey(4);
        ll.searchKey(5);
        System.out.println("--Reversal--");
        ll.reverseList();
        ll.show();

        System.out.println("===Doubly Linked List===");
        DoubleLinked dl = new DoubleLinked();
        dl.insert(2);
        dl.insert(4);
        dl.insert(3);
        dl.show();
        System.out.println("--Insertion--");
        dl.insertAt(1, 9);
        dl.insertAt(2, 8);
        dl.show();
        System.out.println("--Deletion--");
        dl.deleteAt(3);
        dl.show();

        System.out.println("===Circular Linked List===");
        CircularLinked cl = new CircularLinked();
        cl.insert(7);
        cl.insert(5);
        cl.show();

    }
}