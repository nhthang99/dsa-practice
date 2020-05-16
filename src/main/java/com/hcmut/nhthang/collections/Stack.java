package com.hcmut.nhthang.collections;

public class Stack<T>{

    private Node headNode = null; // top of stack
    private int length = 0; // number of items
    private int max_length = 100;

    private class Node{
        private T item;
        private Node next;

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

    public T peek(){
        if (!isEmpty())
            return this.headNode.item;
        return null;
    }

    public boolean isEmpty(){
        return this.length == 0;
    }

    public boolean isFull(){
        return this.length == this.max_length;
    }

    public int length(){
        return this.length;
    }
}
