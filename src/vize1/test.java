package vize1;

public class test {
    public static void main(String[] args) {
        Stack stackList = new Stack();
        stackList.add(23);
        stackList.add(12);
        stackList.add(43);
        stackList.add(54);
        stackList.add(65);

        stackList.printList();

        stackList.pop();
        stackList.pop();
        stackList.pop();
        stackList.printList();
        stackList.pop();
        stackList.pop();
        stackList.pop();

        stackList.printList();


    }
}
