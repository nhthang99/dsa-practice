package collections;

public class Stack<T>{

    private Node headNode = null; // top of stack
    private int length = 0; // number of items

    private class Node{
        T item;
        Node next;

        public Node(final T item) {
            this.item = item;
            this.next = null;
        }
    }

    public void push(final T item) {
        final Node newNode = new Node(item);

        if (isEmpty()) {
            this.headNode = newNode;
        } else {
            newNode.next = this.headNode;
            this.headNode = newNode;
        }

        this.length += 1;
    }

    public T pop(){
        if (!isEmpty()){
            final Node temp = this.headNode;
            this.headNode = this.headNode.next;
            this.length -= 1;
            return temp.item;
        }
        return null;
    }

    public boolean isEmpty(){
        return this.length == 0;
    }

    public int length(){
        return this.length;
    }
}