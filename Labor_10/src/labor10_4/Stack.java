package labor10_4;

import java.util.ArrayList;

public class Stack {
    private int capacity;
    ArrayList<Object> items = new ArrayList<>();

    public Stack(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull() {
        return this.items.size() == this.capacity;
    }

    public boolean isEmpty() {
        return this.items.size() == 0;
    }

    public void push(Object element) throws StackException {
        if(this.isFull()) {
            throw new StackException("Stack is full!");
        }
        this.items.add(element);
    }

    public void pop() throws StackException {
        if(this.isEmpty()) {
            throw new StackException("Stack is empty!");
        }
        this.items.remove(this.items.size() - 1);
    }

    public Object top() throws StackException {
        if(this.isEmpty()) {
            throw new StackException("Stack is empty!");
        }
        return this.items.get(items.size() - 1);
    }

    public int getSize() {
        return this.items.size();
    }
}
