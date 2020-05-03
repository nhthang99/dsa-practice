package collections;

public class Queue<T> {
    
    private Node headNode; // head of queue
    private Node tailNode; // tail of queue
    private int length; // number of items

    private class Node{
        T item;
        Node next;

        public Node(T item){
            this.item = item;
            this.next = null;
        }
    }

    public void push(T item){
        final Node newNode = new Node(item);
        
        if (isEmpty()) {
            this.headNode = newNode;
            this.tailNode = newNode;
            this.headNode.next = this.tailNode;
        }
        else {
            this.tailNode.next = newNode;
            this.tailNode = newNode;
        }

        this.length += 1;
    }

    public T pop(){
        if (!isEmpty()){
            Node temp = this.headNode;
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