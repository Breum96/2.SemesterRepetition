package stak_struktur.stack;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListStack implements StackI{

    private ArrayList<Object> stack;
    private int currentSize;

    public ArrayListStack(){

        stack = new ArrayList<>();
        currentSize = 0;
    }


    @Override
    public void push(Object element) {
        stack.add(element);
        currentSize++;

    }

    @Override
    public Object pop() {
        if (stack.isEmpty()){
            throw new NoSuchElementException();
        }
        Object element = stack.get(stack.size() -1);
        stack.remove(stack.size()-1);
        currentSize--;
        return element;
    }

    @Override
    public Object peek() {
        if (stack.isEmpty()){
            throw new NoSuchElementException();
        }
        return stack.get(stack.size() -1);
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        if (currentSize == 0){
            return true;
        }else{
            return false;
        }
    }
}
