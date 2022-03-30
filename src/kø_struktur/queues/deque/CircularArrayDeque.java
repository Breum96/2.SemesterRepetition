package kø_struktur.queues.deque;

import kø_struktur.queues.deque.DequeI;


public class CircularArrayDeque implements DequeI {
    private Object[] array;
    private int size;
    private int head;
    private int tail;

    public CircularArrayDeque(int capacity) {
        array = new Object[capacity];
        size = 0;
        head = 0;
        tail = 0;
    }

    public void addFirst(Object o) {
        if (size == array.length) {
            growIfNecessary();
        }
        if (head == 0) {
            head = array.length - 1;
        } else {
            head--;
        }
        array[head] = o;
        size++;
    }

    public void addLast(Object o) {
        if (size == array.length) {
            growIfNecessary();
        }
        array[tail] = o;
        if (tail == array.length - 1) {
            tail = 0;
        } else {
            tail++;
        }
        size++;
    }

    public Object removeFirst() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object o = array[head];
        array[head] = null;
        if (head == array.length - 1) {
            head = 0;
        } else {
            head++;
        }
        size--;
        return o;
    }

    public Object removeLast() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object o = array[tail];
        array[tail] = null;
        if (tail == 0) {
            tail = array.length - 1;
        } else {
            tail--;
        }
        size--;
        return o;
    }



    public Object getFirst() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return array[head];
    }

    public Object getLast() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return array[tail];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void growIfNecessary() {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }




}
