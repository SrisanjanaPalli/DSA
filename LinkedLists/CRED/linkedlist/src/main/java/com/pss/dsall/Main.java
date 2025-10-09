package com.pss.dsall;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // LinkedList list = new LinkedList<>();
        // list.add(4);
        // list.add(5);
        // list.add(2);
        // System.out.println(list);

        Linked ll = new Linked();
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

    }
}