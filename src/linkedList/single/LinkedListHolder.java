package linkedList.single;

public class LinkedListHolder {

    private Node head;
    private Node tail;
    private int size;

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    public LinkedListHolder() {
        this.size = 0;
    }

    public Node getNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        System.out.println();
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("#");
        System.out.println();
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index) {
        if (index > size - 1) {
            System.out.println("Invalid Index !");
            return;
        }
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size - 1) {
            insertLast(value);
            return;
        }

        Node temp = getNode(index - 1);
        temp.next = new Node(value, temp.next);
        size++;
    }

    public void deleteFirst() {
        if (size == 0) {
            System.out.println("No Element to delete !");
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;
    }

    public void deleteLast() {
        if (size <= 0) {
            deleteFirst();
            return;
        }
        tail = getNode(size - 2);
        tail.next = null;
        size--;
    }

    public void deleteValue(int value) {
        if (size == 0) {
            System.out.println("No Element to delete !");
            return;
        }
        if (head.value == value) {
            deleteFirst();
        }
        if (tail.value == value) {
            deleteLast();
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.value == value) {
                Node tempNode = temp.next;
                temp.next = temp.next.next;
                tempNode = null;
                size--;
            }
            temp = temp.next;
        }
    }

    public void delete(int index) {
        if (size == 0) {
            System.out.println("No Element to delete !");
            return;
        }
        if (index == 1 || size <= 1) {
            deleteFirst();
            return;
        }
        if (index == size) {
            deleteLast();
            return;
        }
        if (index > size) {
            System.out.println("Invalid Index !");
            return;
        }
        Node temp = getNode(index - 2);
        temp.next = temp.next.next;
        size--;
    }
}
