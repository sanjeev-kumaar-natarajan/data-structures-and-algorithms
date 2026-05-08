package linkedList.doubly;

public class DoublyLinkedListDriver {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(1);
        doublyLinkedList.insertLast(3);
        doublyLinkedList.insert(2, 1);
        doublyLinkedList.insert(4, 3);
        doublyLinkedList.insert(0, 0);
        doublyLinkedList.insert(7, 3);
        doublyLinkedList.display();
        doublyLinkedList.delete(0);
        doublyLinkedList.delete(5);
        doublyLinkedList.delete(2);
        doublyLinkedList.display();
        doublyLinkedList.displayReverse();
    }
}
