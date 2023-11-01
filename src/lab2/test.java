package lab2;

public class test {
    public static void main(String[] args) {
        Queue<String> kuyruk = new Queue<>();
        kuyruk.enqueue("eleman1");
        kuyruk.print();
        System.out.println(kuyruk.getsize());
        kuyruk.enqueue("eleman2");
        kuyruk.enqueue("eleman3");
        kuyruk.print();
        System.out.println(kuyruk.getsize());
        System.out.println(kuyruk.dequeue());
        kuyruk.print();
        System.out.println(kuyruk.getsize());


        QueueArray kuyruk1 = new QueueArray(5);
        kuyruk1.enqueue(7);
        kuyruk1.enqueue(3);
        kuyruk1.enqueue(2);
        kuyruk1.enqueue(1);
        kuyruk1.print();

        kuyruk1.enqueue(8);
        kuyruk1.enqueue(9);
        kuyruk1.print();
        System.out.println(kuyruk1.dequeue());
        kuyruk1.enqueue(10);
        kuyruk1.print();


    }
}