package labor8_1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        IQueue queue = new CircularQueue(5); // new CircularQueue( 5 );
        Random rnd = new Random();
        for (int i = 0; i < 100; ++i) {
            int value = rnd.nextInt(100);
            if (value < 50) {
                System.out.println("Add: " + i);
                queue.enQueue(i);
            } else {
                if (!queue.isEmpty()) {
                    int element = (Integer) queue.deQueue();
                    System.out.println("Deleted: " + element);
                }
            }
            queue.printQueue();
        }
//        IQueue q1 = new ArrayListQueue(5);
//        IQueue q2 = new ArrayListQueue(10);
//        for(int i = 1; i < 4; ++i) {
//            q1.enQueue(i);
//            q2.enQueue(i);
//        }
//        System.out.println(q1.equals(q2));
//        System.out.println(q1 == q2);
    }
}
