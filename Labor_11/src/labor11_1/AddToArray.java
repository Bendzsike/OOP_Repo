package labor11_1;

import java.util.Random;

public class AddToArray extends Thread{
    private String[] array;

    public AddToArray(String[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        Random rand = new Random();
        while(Main.counter > 0) {
            int num = rand.nextInt(26);
            char ch = (char)(97 + num);
            synchronized (array) {
                array[minIndex()] = "" + ch + ch + ch;
                --Main.counter;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            print();
        }
    }

    public int minIndex() {
        int min = 0;
        String minS = array[min];
        for (int i = 1; i < array.length; i++) {
            if(array[i].compareTo(minS) < 0) {
                minS = array[i];
                min = i;
            }
        }
        return min;
    }

    public void print() {
        System.out.print(Thread.currentThread().getName() + ": ");
        for(String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
