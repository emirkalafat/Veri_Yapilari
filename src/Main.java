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
    }

}
