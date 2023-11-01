package lab1;

public class Main {
    public static void main(String[] args) {

        BList list1 = new BList(12);
        list1.printList();
        list1.printSize();
        list1.addFirst(23);
        list1.printList();
        list1.printSize();
        list1.removeFirst();
        list1.printList();
        list1.removeFirst();
        list1.printList();
        list1.printSize();
        list1.removeFirst();

        list1.addLast(23);
        list1.printList();
        list1.addLast(32);
        list1.printList();
        list1.addFirst(34);
        list1.printList();
        list1.removeLast();
        list1.printList();

        BList odev = new BList(12);
        odev.addLast(13);
        odev.addLast(14);
        odev.addLast(15);
        odev.addLast(16);

        odev.printList();
        odev.addKthPosition2(99, 3);
        odev.printList();

        System.out.println(odev.removeKthPosition2(99).data);
        odev.printList();
    }

}
