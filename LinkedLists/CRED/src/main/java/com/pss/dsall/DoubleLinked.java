package com.pss.dsall;

public class DoubleLinked {
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
        n.prev = temp;
        }
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
            n.prev = temp;
            if(temp.next != null) {
                temp.next.prev = n;
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

    public void deleteAt(int index) {
        int count = 0;
        Node temp = head;

        if(index == 0) {
            head = temp.next;
            if(head != null) {
                head.prev = null;
            }
            return;
        }
        while(count < index-1 && temp.next != null) {
            count ++;
            temp = temp.next;
        }
        if(temp.next == null) {
            System.out.println("invalid index!");
        } else {
            Node toDelete = temp.next;
            temp.next = toDelete.next;
            if(toDelete.next != null) {
                toDelete.next.prev = temp;
            }
            toDelete.prev = null;
            toDelete.next = null;
        }
    }
            
}
