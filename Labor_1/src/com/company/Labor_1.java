package com.company;
import java.util.Arrays;
import java.util.Random;

public class Labor_1 {
    public static void main(String args[]) {
        System.out.println("I.");
        System.out.println("1. feladat:");
        System.out.println("Bodor Benjamin, Csikszereda, Kereskedelem, Kajoni Janos");
        String name = "Bodor Benjamin";
        System.out.println("2. feladat:");
        for (int i = 0; i < name.length(); ++i) {
            System.out.print(name.charAt(i));
        }
        String monogram = "B" + "B";
        System.out.println(monogram);
        System.out.println("3. feladat:");
        String str = "ALMAFA";
        for (int i = 0; i < str.length(); ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }

        System.out.println("4. feladat");
        String name2 = "Kerekes Balint Adam Jozsef";
        String[] words = name2.split(" ");
        String monogram2 = "";
        for (String word : words) {
//            System.out.print(word.charAt(0));
            monogram2 += word.charAt(0);
        }
        System.out.println(monogram2);
        System.out.println("II.");
        System.out.println("1. feladat:");
        double x[] = {7, 1, -3, 45, 9};
        System.out.printf("MAX: %6.2f\n", maxElement(x));

        double y[] = {};
        System.out.printf("MAX: %6.2f\n", maxElement(y));

        double z[] = null;
        System.out.printf("MAX: %6.2f\n", maxElement(z));

        System.out.println("2. feladat:");
        int number = 13;
        for (int i = 0; i < 34; ++i) {
            System.out.println(getBit(number, i));
        }

        System.out.println("3. feladat:");
        for(int i = 0; i < 32; ++i){
            System.out.println(i + " - " + countBits(i));
        }

        System.out.println("4. feladat:");
        double array2[] = {0.2, 3.4, 5, 4.3, 6.9, 4.20};
//        double array2[] = null;
        System.out.printf("%.2f\n", mean(array2));

        System.out.println("5. feladat:");
        System.out.printf("%.2f\n", stddev(array2));

        System.out.println("6. feladat:");
        double array3[] = {1, 2, 3, 6, 4, 5, 7, 9, 9, 2};
        double maximum[] = max2(array3);
        for(double i : maximum){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Extra:");
        System.out.println("E1. feladat:");
        System.out.println("Duplum: " + randomGeneratedArray());

        System.out.println("E2. feladat:");
        int value = 13;
        int answer = binarySearchInRandomArray(value, 5000);
        if(answer >= 0) {
            System.out.println(value + " was found in the random generated array on index " + answer);
        }
    }

    public static double maxElement(double array[]) {
        double max = Double.NEGATIVE_INFINITY;
        if (array == null) {
            System.out.println("Nem letezo tomb!");
            return max;
        }
        for (double v : array) {
            if (max < v) {
                max = v;
            }
        }
        return max;
    }

    public static byte getBit(int number, int order) {
        if (order > 31 || order < 0) {
            return -1;
        }
        return (byte) ((number >> order) & 1);
    }

    public static int countBits(int number) {
        int count = 0;
        while(number > 0){
            count += number & 1;
            number >>= 1;
        }
        return count;
    }

    public static double mean(double array[]){
        if(array == null){
            return Double.NaN;
        }
        double mean = 0;
        for(double i : array){
            mean += i;
        }
        return mean / array.length;
    }

    public static double stddev(double array[]){
        if(array == null){
            return Double.NaN;
        }
        double mean = mean(array);
        double sum = 0;
        for(double i : array){
            sum += Math.pow(i - mean, 2);
        }
        return Math.sqrt(sum / array.length);
    }

    public static double[] max2(double array[]){
        double max[] = {Double.NaN, Double.NaN};
        if(array == null){
            return max;
        } else if(array.length == 1){
            max[0] = max[1] = array[0];
            return max;
        }
        max[0] = max[1] = Double.NEGATIVE_INFINITY;

        for(double i : array) {
            if (i > max[0] && i > max[1]) {
                max[0] = max[1];
                max[1] = i;
            } else if (i > max[1]) {
                max[1] = i;
            }
        }
        return max;
    }

    public static int randomGeneratedArray(){
        Random rand = new Random();

        int[] array = new int[1000000];
        for(int i = 0; i < array.length; ++i){
            array[i] = rand.nextInt(100);
        }
        Arrays.sort(array);
        int duplum = 0;
        for(int i = 1; i < array.length; ++i){
            if(array[i - 1] == array[i]){
                ++duplum;
            }
        }
        return duplum;
    }

    public static int binarySearchInRandomArray(int value, int size){
        Random rand = new Random();

        int[] array = new int[size];
        for(int i = 0; i < array.length; ++i){
            array[i] = rand.nextInt(100);
        }
        Arrays.sort(array);
        long startTime = System.nanoTime();

        int key1 = selfMadeBinarySearch(array, 0, array.length - 1, value);

        long endTime = System.nanoTime();

        if(key1 >= 0) {
            System.out.println("Finding the value with self made binary search took " + (endTime - startTime) + " miliseconds!");
        }

        startTime = System.nanoTime();

        int key2 = Arrays.binarySearch(array, value);

        endTime = System.nanoTime();

        if(key2 >= 0) {
            System.out.println("Finding the value with Arrays.binarySearch took " + (endTime - startTime) + " miliseconds!");
        }

        if(key1 < 0 && key2 < 0){
            System.out.println("Neither of the two managed to find the value");
            return -1;
        } else if(key1 < 0){
            System.out.println("Self made binary search failed to find the value!");
            return -1;
        } else if(key2 < 0){
            System.out.println("Arrays.binarySearch failed to find the value!");
            return -1;
        }

        if(key1 == key2){
            System.out.println("Both binary search algorithms found the same value!");
            return key2;
        } else{
            System.out.println("The algorithms failed to find the same value!");
            System.out.println("The self made binary search found it on index " + key1);
            System.out.println("While Arrays.binarySearch found it on index " + key2);
            return -1;
        }
    }

    public static int selfMadeBinarySearch(int array[], int left, int right, int value){
        if(left <= right){
            int middle = left + (right - left) / 2;
            if(array[middle] == value) {
                return middle;
            } else if(value < array[middle]){
                return selfMadeBinarySearch(array, left, middle - 1, value);
            } else {
                return selfMadeBinarySearch(array, middle + 1, right, value);
            }
        }
        return -1;
    }
}
