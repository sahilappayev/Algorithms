package az.sahil.ds.linkedlist;

public class CircularLinkedList {
    private Node first;
    private Node last;

    public CircularLinkedList() {
        this.first = null;
        this.last = null;
    }

    public void addFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            last = newNode;
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
            last = newNode;
        }
    }

    public boolean isEmpty() {
        return (first == null);
    }


    public int deleteFirst(){
        int temp = first.data;

        if (first.next == null){
            last = null;
        }
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
