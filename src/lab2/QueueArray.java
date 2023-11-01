package lab2;

public class QueueArray<T> {
    private int front, rear;
    private T array[];
    private int size;

    public QueueArray(int capacity) {
        array = (T[]) new Object[capacity];
        front = rear = 0;
        size = 0;
    }

    void enqueue(T data) {
        if (size == array.length) {
            System.out.println("Dizi doldu olduğundan ekleme yapılamadı.");
        } else {
            array[rear] = data;
            rear++;
            rear = rear % array.length;
            size++;
        }
    }

    T dequeue() {
        T remove = null;
        if (size == 0) {
            System.out.println("Kuyruk boş oldugundan eleman çıkarılamaz");
        } else {
            remove = array[front];
            front++;
            front = front % array.length;
            size--;
        }
        return remove;
    }

    void print() {
        int temp = front;
        for (int i = 0; i < size; i++) {
            System.out.print(array[temp] + " -> ");
            temp++;
            temp = temp % array.length;
        }
        System.out.println(" null");
    }

    int getsize() {
        return size;
    }

}