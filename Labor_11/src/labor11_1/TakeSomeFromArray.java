package labor11_1;

public class TakeSomeFromArray extends Thread{
    private int counter;
    private String replace;
    private String[] array;

    public TakeSomeFromArray(String[] array, String replace, int counter) {
        this.array = array;
        this.replace = replace;
        this.counter = counter;
    }

    @Override
    public void run() {
        int count = 0;
        while(count != counter) {
            synchronized (array) {
                int index = searchIndex();
                if (index != -1) {
                    array[index] = " ";
                    --Main1.counter;
                    ++count;
                    System.out.println(Thread.currentThread().getName() + ": String \"" + replace + "\" has been replaced with \" \" (" + count + ". time(s))");
                }
            }
            if(Main1.counter <= 0) {
                stop();
            }
        }
        System.out.println(Thread.currentThread().getName() + ": String \"" + replace + "\" has been replaced " + count + " time(s), thread finishes work.");
    }

    public int searchIndex() {
        for(int i = 0; i < array.length; ++i) {
            if(array[i].equals(replace)) {
                return i;
            }
        }
        return -1;
    }
}
