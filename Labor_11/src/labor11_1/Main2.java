package labor11_1;

public class Main2 {
    public static void main(String[] args) {
        String sa_array[] = new String[10];
        for (int i = 0; i < sa_array.length; ++i) {
            sa_array[i] = " ";
        }

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
