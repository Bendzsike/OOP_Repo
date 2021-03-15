package labor4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    private int length;
    private double[] array;

    public MyArray(int length) {
        this.length = length;
        this.array = new double[this.length];
    }

    public MyArray(double[] array) {
        this.length = array.length;
        this.array = array;
    }

    public MyArray(MyArray array) {
        this.length = array.getLength();
        this.array = array.getArray();
    }

    public MyArray(String fileName) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found!");
            System.exit(1);
        }

        this.length = scanner.nextInt();

        this.array = new double[this.length];

        for(int i = 0; i < this.length; ++i) {
            this.array[i] = scanner.nextDouble();
        }
    }

    public double[] getArray() {
        return array;
    }

    public int getLength() {
        return length;
    }

    public void fillRandom(double first, double last) {
        Random rand = new Random();
        for(int i = 0; i < this.length; ++i) {
            this.array[i] = first + (last - first) * rand.nextDouble();
        }
    }

    public double mean() {
        double sum = 0;
        for(double num : this.array) {
            sum += num;
        }
        return sum / this.length;
    }

    public double stddev() {
        double mean = this.mean();
        double standard_dev = 0;
        for(double num : this.array) {
            standard_dev = Math.pow(num - mean, 2);
        }
        return Math.sqrt(standard_dev / this.length);
    }

    public void sort() {
        Arrays.sort(this.array);
    }

    public void print(String name) {
        System.out.print(name + ":");
        for(double num : this.array) {
            System.out.printf("%10.2f", num);
        }
        System.out.println();
    }
}
