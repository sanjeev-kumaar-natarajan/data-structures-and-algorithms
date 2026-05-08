package linkedList.circular;

public class CircularLinkedListDriver {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertFirst(9);
        circularLinkedList.insertFirst(7);
        circularLinkedList.insertFirst(5);
        circularLinkedList.insertFirst(3);
        circularLinkedList.insertFirst(1);
        circularLinkedList.display();
        circularLinkedList.delete(0);
        circularLinkedList.delete(3);
        circularLinkedList.delete(1);
        circularLinkedList.display();
    }
}
