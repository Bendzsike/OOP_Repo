package labor4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = readFromFile("Labor_4/labor4_2_input.txt");
        for(Customer customer : customers) {
            System.out.println(customer);
        }

    }

    public static ArrayList<Customer> readFromFile(String fileName) {
        ArrayList<Customer> customers = new ArrayList<>();
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found!");
            return customers;
        }

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if(line.isEmpty()) {
                continue;
            }

            String[] items = line.split(",");
            if(items[0].trim().equals("Customer")) {
                String firstName = items[1].trim();
                String lastName = items[2].trim();
                customers.add(new Customer(firstName, lastName));
            }else if(items[0].trim().equals("Account")) {
                items = line.split(",");

                String account = items[1].trim();
                int amount = Integer.parseInt(items[2].trim());
                customers.get(customers.size() - 1).addAccount(new BankAccount(account));
                customers.get(customers.size() - 1).getAccount(account).deposit(amount);
            }
        }

        return customers;
    }
}
