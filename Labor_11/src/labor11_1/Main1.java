package labor11_1;

public class Main1 {
    public static void main(String[] args) {
        String sa_array[] = new String[10];
        for (int i = 0; i < sa_array.length; ++i) {
            sa_array[i] = " ";
        }

        Thread producer = new AddToArray(sa_array);
        producer.start();

        Thread editor = new TakeSomeFromArray(sa_array, "aaa", 5);
        editor.start();
    }

    static int counter = 300;
}
