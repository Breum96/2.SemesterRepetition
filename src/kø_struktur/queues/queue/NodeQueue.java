package kø_struktur.queues.queue;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a linked list.
 */
public class NodeQueue implements QueueI
{

    private Node head;
    private Node tail;
    private int size;
    private Object[] elements;

    /**
     * Constructs an empty queue.
     */
    public NodeQueue()
    {
        head = null;
        tail = null;
        size = 0;
        elements = new Object[10];
    }

    // add element to the end of the queue
    @Override
    public void enqueue(Object element)
    {
        Node newNode = new Node(element);
        if (size == 0)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    // remove element from the beginning of the queue
    @Override
    public Object dequeue()
    {
        if (size == 0)
        {
            throw new NoSuchElementException();
        }
        Object element = head.getData();
        head = head.getNext();
        size--;
        return element;
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }

    class Node
    {
        public Object data;
        public Node next;

        public Node(Object data)
        {
            this.data = data;
        }

        public void setNext(Node next)
        {
            this.next = next;
        }

        public Object getData()
        {
            return data;
        }

        public Node getNext()
        {
            return next;
        }

        public String toString()
        {
            return data.toString();
        }


    }
}
