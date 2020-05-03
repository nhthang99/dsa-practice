import java.util.Iterator;

public class Bag<T> {

    private Node headNode;

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
        newNode.next = this.headNode;
        this.headNode = newNode;
    }

    public Iterator<T> iterator(){
        return new BagIterator();
    }

    private class BagIterator implements Iterator<T>{
        private Node currentNode = headNode;

        public boolean hasNext(){
            return this.currentNode != null;
        }

        public T next(){
            Node node = this.currentNode;
            this.currentNode = this.currentNode.next;
            return node.item;
        }
    }
}