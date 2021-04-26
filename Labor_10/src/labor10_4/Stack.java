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

    public void push(Object element) {
        if(this.isFull()) {
            System.out.println("Stack is full!");
            return;
        }
        this.items.add(element);
    }

    public void pop() {
        if(this.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        this.items.remove(this.items.size() - 1);
    }

    public Object top() {
        if(this.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return this.items.get(items.size() - 1);
    }

    public int getSize() {
        return this.items.size();
    }
}
