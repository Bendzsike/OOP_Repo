package labor5_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
//        ArrayList<BankAccount> accounts = new ArrayList<>();
//        for(int i = 0; i < 150; ++i) {
//            accounts.add(new BankAccount());
//        }
//        for(BankAccount account : accounts) {
//            System.out.println(account);
//        }
//        ArrayList<Customer> customers = new ArrayList<>();
//        customers.add(new Customer("John", "Black"));
//        customers.add(new Customer("Mary", "White"));
//        customers.add(new Customer("John", "Gold"));
//        for(int i = 0; i < 3; ++i) {
//            int limit = rand.nextInt(10);
//            for(int j = 0; j < limit; ++j) {
//                customers.get(i).addAccount(new BankAccount());
//            }
//        }
//        System.out.println(customers);
        Bank OTP = new Bank("OTP");
        OTP.addCustomer(new Customer("Mary", "White"));
        OTP.addCustomer(new Customer("John", "Gold"));
        OTP.getCustomer(1).addAccount(new BankAccount());
        OTP.getCustomer(1).addAccount(new BankAccount());
        OTP.getCustomer(2).addAccount(new BankAccount());
        OTP.getCustomer(2).addAccount(new BankAccount());
        System.out.println(OTP.getCustomer(1));
        OTP.getCustomer(1).getAccount("OTP0000001").deposit(rand.nextInt(1000));
        OTP.getCustomer(1).getAccount("OTP0000002").deposit(rand.nextInt(1000));
        System.out.println(OTP.getCustomer(1));
        System.out.println(OTP.getCustomer(2));
        OTP.printCustomersToFile("bank_customers.csv");
    }
}
