package lab2;

public class Queue<T> {
    private Node<T> front, rear;
    private int size = 0;

    Queue() {
        front = rear = null;
    }

    void enqueue(T data) {
        Node<T> newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    T dequeue() {
        T remove = null;
        if (front == null) {
            System.out.println("Çıkarılacak eleman yok");
        } else {
            remove = front.data;
            front = front.next;
            size--;
        }
        return remove;
    }

    int getsize() {
        return size;
    }

    void print() {
        Node<T> temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }

}