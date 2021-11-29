package az.sahil.ds.linkedlist;

public class App {

    public static void main(String[] args) {
        /*
        Node nodeA = new Node();
        nodeA.data = 5;
        Node nodeB = new Node();
        nodeB.data = 15;
        Node nodeC = new Node();
        nodeC.data = 25;
        Node nodeE = new Node();
        nodeE.data = 345;

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeE;


        System.out.println("Time 1 : " + new Date().getTime());
        System.out.println(listLength(nodeA));
        System.out.println("Time 2 : " + new Date().getTime());
        System.out.println(listLength1(nodeA));
        System.out.println("Time 3 : " + new Date().getTime());

        */

        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(5);
        list.addFirst(6);
        list.deleteFirst();
        list.addFirst(7);
        list.addFirst(8);
        list.deleteLast();
        list.addLast(21);

        list.displayList();

//        System.out.println(10<<1);//10*2^1=10*2=20
//        System.out.println(10<<2);//10*2^2=10*4=40
//        System.out.println(10<<3);//10*2^3=10*8=80
//        System.out.println(20<<2);//20*2^2=20*4=80
//        System.out.println(15<<4);//15*2^4=15*16=240


    }


    public static int listLength(Node node) {
        int size = 1;
        if (node.next == null) {
            return size;
        } else {
            size += listLength(node.next);
        }
        return size;
    }

    public static int listLength1(Node node) {
        int length = 0;
        Node currentNode = node;
        while (currentNode != null){
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }


}
