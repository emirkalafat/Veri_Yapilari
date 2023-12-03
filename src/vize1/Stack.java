package vize1;

import lab1.Node;

public class Stack {
    Node top;

    void add(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    void pop() {
        if (top == null) {
            System.out.println("silinecek eleman kalmadı!");
            return;
        }
        top = top.next;
    }

    void printList() {
        Node temp = this.top;
        if (temp == null) {
            System.out.println("Liste Boş");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}
