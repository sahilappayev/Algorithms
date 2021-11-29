package az.sahil.ds.stack;

public class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;


    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new char[size];
        this.top = -1;
    }


    public void push(char value) {
        if (isFull()) {
            System.out.println("The stack is full!");
        } else {
            this.top++;
            this.stackArray[this.top] = value;
        }
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            return '0';
        } else {
            int old_top = this.top;
            this.top--;
            return this.stackArray[old_top];
        }
    }

    public char peak() {
        return this.stackArray[this.top];
    }

    public boolean isEmpty() {
        return (this.top == -1);
    }

    public boolean isFull() {
        return (this.maxSize - 1 == this.top);
    }
}
