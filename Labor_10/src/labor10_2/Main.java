package labor10_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintStream printStream;
        try {
            printStream = new PrintStream("warnings.csv");
        } catch (FileNotFoundException e) {
            System.out.println("Error creating the file!");
            e.printStackTrace();
            return;
        }
        Scanner scanner;
        try {
            scanner = new Scanner(new File("Labor_10/students.csv"));
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file!");
            e.printStackTrace();
            return;
        }

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.split(",");
            if(values.length < 7) {
                System.out.println("INCOMPETE LINE: " + line);
                continue;
            }
            int credit;
            try {
                credit = Integer.parseInt(values[3].trim());

            } catch (NumberFormatException nfe) {
                System.out.println("NUMBER FORMAT EXCEPTION: " + line + " : " + values[3].trim());
                continue;
            }
            int year, month, day;
            try {
                year = Integer.parseInt(values[4].trim());

            } catch (NumberFormatException nfe) {
                System.out.println("NUMBER FORMAT EXCEPTION: " + line + " : " + values[4].trim());
                continue;
            }
            try {
                month = Integer.parseInt(values[5].trim());

            } catch (NumberFormatException nfe) {
                System.out.println("NUMBER FORMAT EXCEPTION: " + line + " : " + values[5].trim());
                continue;
            }
            try {
                day = Integer.parseInt(values[6].trim());

            } catch (NumberFormatException nfe) {
                System.out.println("NUMBER FORMAT EXCEPTION: " + line + " : " + values[6].trim());
                continue;
            }
            if(!DateUtil.isValidDate(year, month, day)) {
                System.out.println("INVALID DATE: " + line);
            }
            if(credit < 30) {
                printStream.println(line);
            }
        }
        scanner.close();
        printStream.close();
    }
}
