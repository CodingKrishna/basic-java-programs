package com.Arrays;

public class Node {
    int data;
    Node nextNode;
}

class myList {
    Node head, temp;

    public void add(int a) {
        Node b = new Node();
        b.data = a;

        if (head == null) {
            head = b; // 34
            temp = b; //
        } else {
            temp.nextNode = b; //
            temp = b; //
        }
        display(b);
        //  remove();
    }

    public void display(Node b) {
        Node temp = b;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.nextNode;
        }
    }

    public static void main(String[] args) {
        myList list = new myList();
        list.add(34);
        list.add(67);
        list.add(98);
        list.add(44);
        list.add(88);
        list.add(77);

    }

}


