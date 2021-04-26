package labor10_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sum = 0;
        Scanner scanner;
        {
            try {
                scanner = new Scanner(new File("Labor_10/input.txt"));
                while(scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] values = line.split(" ");
                    for(String e : values) {
                        try {
                            sum += Double.parseDouble(e);
                        } catch (NumberFormatException nfe) {
                            System.out.println(e + " is not numeric!");
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error with file!");
                e.printStackTrace();
            }
        }
        System.out.println("Sum: " + sum);
    }
}
