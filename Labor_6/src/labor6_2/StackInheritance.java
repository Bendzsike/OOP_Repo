package labor6_2;

import java.util.ArrayList;

public class StackInheritance extends ArrayList<Object> {
    private int capacity;

    public StackInheritance(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull() {
        return this.size() == capacity;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void push(Object element) {
        if(this.isFull()) {
            System.out.println("Stack is full!");
            return;
        }
        this.add(element);
    }

    public void pop() {
        if(this.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        this.remove(this.size() - 1);
    }

    public Object top() {
        return this.get(this.size() - 1);
    }

    public int getSize() {
        return this.size();
    }
}
