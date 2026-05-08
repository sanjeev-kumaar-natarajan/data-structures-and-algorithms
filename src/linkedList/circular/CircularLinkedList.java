package linkedList.circular;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void display() {
        Node temp = head;
        System.out.println();
        do {
            System.out.print(temp.value + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.print("()");
        System.out.println();
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        if (head == tail && head == null) {
            newNode.next = newNode;
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
        size++;
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);
        if (head == tail && head == null) {
            newNode.next = newNode;
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
        size++;
    }

    public void insert(int value, int index) {
        if (index == 0 || head == null) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node newNode = new Node(value);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void deleteFirst() {
        tail.next = head.next;
        head = head.next;
        size--;
    }

    public void deleteLast() {
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = head;
        tail = temp;
        size--;
    }

    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size - 1) {
            deleteLast();
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
}
