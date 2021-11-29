package az.sahil.ds.linkedlist;

public class DoublyLinkedList {

    private Node first;
    private Node last;

    public boolean isEmpty() {
        return first == null;
    }

    public void addFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
        }

        newNode.next = first;
        first = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }

        last = newNode;
    }

    public Node deleteFirst() {
        Node temp = first;

        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public Node deleteLast() {
        Node temp = last;

        if (temp.previous == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(int key, int data) {
        Node current = first;
        while (current.data != key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }
        Node newNode = new Node();
        newNode.data = data;

        if (current == last) {
            current.next = null;
            last = newNode;
        } else {
            newNode.next = current.next;
            current.next.previous = newNode;
        }
        newNode.previous = current;
        current.next = newNode;
        return true;
    }

    public Node deleteKey(int key) {
        Node current = first;

        while (current.data != key) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }

        if (current == first) {
            first = first.next;
        } else {
            current.previous.next = current.next;
        }

        if (current == last) {
            last = last.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;
    }

    public void displayList() {
        Node current = first;
        System.out.print("{");
        while (current != null) {
            if (current.next == null)
                System.out.print(current + "");
            else
                System.out.print(current + ", ");

            current = current.next;
        }
        System.out.println("}");
    }

    class Node {

        int data;
        Node next;
        Node previous;

        @Override
        public String toString() {
            return "" + data;
        }

    }

}
