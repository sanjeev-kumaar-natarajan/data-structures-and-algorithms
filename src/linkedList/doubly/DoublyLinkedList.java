package linkedList.doubly;

public class DoublyLinkedList {

    private int size;
    private Node head;
    private Node tail;

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public DoublyLinkedList() {
        this.size = 0;
    }

    public void display() {
        System.out.println();
        System.out.print("Display - ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "<>");
            temp = temp.next;
        }
        System.out.print("END");

        System.out.println();
    }

    public void displayReverse() {
        System.out.println();
        System.out.print("Display Reverse - ");
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.value + "<>");
            temp = temp.prev;
        }
        System.out.print("END");
        System.out.println();
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = tail = node;
            size++;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        size++;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = tail = node;
            size++;
            return;
        }
        node.next = tail.next;
        node.prev = tail;
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index) {
        if (index == 0 || head == null) {
            insertFirst(value);
            size++;
            return;
        }
        if (index == size) {
            insertLast(value);
            size++;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node node = new Node(value);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
        size++;
    }

    public void deleteFirst() {
        head = head.next;
        head.prev = null;
        if (size == 1) {
            tail = head;
        }
        size--;
    }

    public void deleteLast() {
        tail = tail.prev;
        tail.next = null;
        if (size == 1) {
            head = tail;
        }
        size--;
    }

    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
            size--;
            return;
        }
        if (index == size - 1) {
            deleteLast();
            size--;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }
}
