package labor11_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] sa_array = new String[10];
        Arrays.fill(sa_array, " ");

//        Thread producer = new AddToArray(sa_array);
//        producer.start();
//
//        Thread editor = new TakeSomeFromArray(sa_array, "aaa", 5);
//        editor.start();

        Thread[] producer = new Thread[4];
        for (Thread th : producer) {
            th = new AddToArray(sa_array);
            th.start();
        }
        Thread[] editor = new Thread[3];
        for(Thread th : editor) {
            th = new TakeSomeFromArray(sa_array, "aaa", 5);
            th.start();
        }
    }

    static int counter = 300;
}
