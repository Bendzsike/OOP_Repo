package labor8_1;

import java.util.ArrayList;

public class CircularQueue implements IQueue{
    private Object[] items;
    private final int CAPACITY;
    private int front;
    private int rear;

    public CircularQueue(int capacity) {
        items = new Object[capacity + 1];
        CAPACITY = capacity;
        front = rear = -1;
    }

    @Override
    public boolean isEmpty() {
        if(front == -1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if(front == 0 && rear == CAPACITY - 1) {
            return true;
        }
        if(front == rear + 1) {
            return true;
        }
        return false;
    }

    @Override
    public void enQueue(Object obj) {
        if(!isFull()) {
            if(front == -1) {
                front = 0;
            }
            rear = (rear + 1) % CAPACITY;
            items[rear] = obj;
        } else {
            System.out.println("Queue is full!");
        }
    }

    @Override
    public Object deQueue() {
        Object element;
        if(!isEmpty()) {
            element = items[front];
            if(front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % CAPACITY;
            }
            return element;
        } else {
            System.out.println("Queue is empty!");
            return null;
        }
    }

    @Override
    public void printQueue() {
        if(!isEmpty()) {
            System.out.println("Front: " + front);
            System.out.print("Elements: ");
            int i;
            for(i = front; i != rear; i = (i + 1) % CAPACITY) {
                System.out.print(items[i] + ", ");
            }
            System.out.println(items[i]);
            System.out.println("Rear: " + rear);
        } else{
            System.out.println("Queue is empty!");
        }
    }
}
