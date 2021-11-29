package az.sahil.ds.queue;

public class Queue {

    private int arraySize;
    private long[] array;
    private int front;
    private int back;
    private int nItems;

    public Queue(int arraySize) {
        this.arraySize = arraySize;
        this.array = new long[arraySize];
        this.front = 0;
        this.back = -1;
        this.nItems = 0;
    }

    public void insert(long value) {

        if (back == arraySize - 1) {
            back = -1;
        }

        back++;
        this.array[back] = value;
        nItems++;
    }

    public long remove() {
        long temp = array[front];
        front++;
        if (front == arraySize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public long peekFront() {
        return array[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    private boolean isFull() {
        return (nItems == arraySize);
    }

    public void view() {
        System.out.print("[ ");
        for (int i = 0; i < this.arraySize; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }
}
