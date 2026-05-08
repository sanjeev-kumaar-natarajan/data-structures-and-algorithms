package linkedList.single;

public class LinkedListDriver {
    public static void main(String[] args) {
        LinkedListHolder linkedList = new LinkedListHolder();
        linkedList.insertFirst(10);
        linkedList.insertFirst(7);
        linkedList.insertFirst(5);
        linkedList.insertLast(13);
        linkedList.insert(0, 100);
        linkedList.insert(1, 0);
        linkedList.insert(15, 4);
        linkedList.insert(6, 2);
        linkedList.insert(8, 4);
        linkedList.display();
        linkedList.deleteFirst();
        linkedList.deleteLast();
        linkedList.delete(1);
        linkedList.delete(5);
        linkedList.delete(3);
        linkedList.display();
    }
}
