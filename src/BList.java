public class BList {
    Node head = null;
    private int size = 0;

    public BList(int data) {
        this.head = new Node(data);
        size++;
    }

    // motodun adı: addKthPosition(data,position);
    // motodun adı: removeKthOsition(position) return data;
    // ? removeFirst

    void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
        size++;
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        Node temp = this.head;
        if (temp == null) {
            head = newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    void removeFirst() {
        if (head != null) {
            this.head = head.next;
            size--;
        } else {
            System.out.println("Listede eleman yok!");
        }
    }

    void removeLast() {
        Node prev = this.head;
        if (head == null) {
            System.out.println("Listede eleman yok!");
        }
        if (this.head.next == null) {
            head = null;
        } else {
            Node curr = this.head.next;
            while (curr.next != null) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
            size--;
        }

    }

    void printSize() {
        System.out.println("Liste Boyutu: " + size);
    }

    void printList() {
        Node temp = this.head;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
