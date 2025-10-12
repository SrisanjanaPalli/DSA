package com.pss.dsall;

public class CircularLinked {
    Node head;

    public void insert(int data) {
        Node n = new Node();
        n.data = data;

        Node temp = head;
        if(temp == null) {
            head = n;
            n.next = head;
        }else{
            while(temp.next != head) {
            temp = temp.next;
        }
        temp.next = n;
        n.next = head;
        }
    }

    public void show() {
        Node temp = head;

        while(temp.next != head) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
