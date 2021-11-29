package az.sahil.ds.linkedlist;

public class SinglyLinkedList {

    private Node first;

    public boolean isEmpty() {
        return (first == null);
    }

    public void addFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public void addLast(int data) {
        Node current = first;
        while (current.next != null){
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;
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


}
