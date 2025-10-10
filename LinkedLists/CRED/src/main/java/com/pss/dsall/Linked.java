package com.pss.dsall;

public class Linked {
    Node head;

    public void insert(int data) {
        
        Node n = new Node();
        n.data = data;

        Node temp = head;
        if(temp == null) {
            head = n;
        }else{
            while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
        }
        
    }

    public void show() {
        Node temp = head;

        while(temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void insertAt(int index, int data) {
        Node n = new Node();
        n.data = data;
        int count = 0;
        Node temp = head;

        if(count > index){
            System.out.println("invalid index!");
        }
        while(count < index-1 && temp.next != null) {
            count ++;
            temp = temp.next;
        }
        if(count < index-1) {
            System.out.println("invalid index!");
        } else {
            n.next = temp.next;
            temp.next = n;
        }
       
    }

    public void deleteAt(int index) {
        int count = 0;
        Node temp = head;

        if(index == 0) {
            head = temp.next;
        }
        while(count < index-1 && temp.next != null) {
            count ++;
            temp = temp.next;
        }
        if(count < index-1)
            System.out.println("invalid index!");
        else {
            temp.next = temp.next.next;
        }
    }

    public void searchKey(int key) {
        Node temp = head;
        while(temp.next != null) {
            if(temp.data == key) {
                System.out.println("Key found!");
                return;
            }
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Key not found!");
        }
    }

    public void reverseList() {
            Node prev = null;
            Node temp = head;
            Node nex = head.next;
        
            while(temp != null) {
                nex = temp.next;
                temp.next = prev;
                prev = temp;
                temp = nex;
            }
            head = prev;

    }
}
