package labor6_1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Bank otp = new Bank("OTP");
        otp.addCustomer(new Customer("John", "Gold"));
        otp.addCustomer(new Customer("Mary", "Bloody"));
        otp.getCustomer(1).addAccount(new CheckingAccount(5000));
        otp.getCustomer(1).addAccount(new SavingsAccount(0.1));
        otp.getCustomer(2).addAccount(new CheckingAccount(5000));
        otp.getCustomer(2).addAccount(new SavingsAccount(0.1));

        Random rand = new Random();
        for(int i = 1; i <= otp.numCustomers(); ++i) {
            ArrayList<String> accNumber = otp.getCustomer(i).getAccountNumbers();
            for(String account : accNumber) {
                otp.getCustomer(i).getAccount(account).deposit(rand.nextInt(1000));
            }
        }
        otp.printCustomersToStdout();
    }
}
