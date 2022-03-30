package stak_struktur.stack;

import java.util.NoSuchElementException;

public class NodeStack implements StackI{

    private Node first;
    private int size;

    public NodeStack(){
        first = null;
    }

    @Override
    public void push(Object element) {
        Node newNode = new Node(element);
        newNode.next = first;
        first = newNode;
        size++;

    }

    @Override
    public Object pop() {
        if(first == null){
            throw new NoSuchElementException();
        }
        Object element = first.data;
        first = first.next;
        size--;
        return element;
    }

    @Override
    public Object peek() {
        if (first == null){
            throw new NoSuchElementException();
        }
        return first.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    class Node{
        public Object data;
        public Node next;

        public Node(Object o){
            data = o;
            next = null;
        }
    }
}
