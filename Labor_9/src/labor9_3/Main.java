package labor9_3;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage("Labor_9/data/data1000000.txt");
        storage.sort();
//        storage.print();
        long start = System.currentTimeMillis();
//        long start = System.nanoTime();
        int amount = storage.update("Labor_9/data/update10000000.txt");
//        long end = System.nanoTime();
        long end = System.currentTimeMillis();
        System.out.println("Amount of items updated: " + amount);
        System.out.println(end - start);
//        storage.print();
    }
}
