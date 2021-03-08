package labor3_2;
import labor3_1.BankAccount;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        Customer customer1 = new Customer("Lucifer", "Morningstar");
        Customer customer2 = new Customer("Chloe", "Decker");
        for(int i = 1; i <= 5; ++i){
            customer1.addAccount(new BankAccount("OTP0000" + i));
        }
        System.out.println(customer1);

        for(int i = 1; i <= 9; ++i){
            customer2.addAccount(new BankAccount("OTP0001" + i));
        }
        System.out.println(customer2);

        for(int i = 0; i < customer1.getNumAccounts(); ++i){
            customer1.getAccount("OTP0000" + (i + 1)).deposit(rand.nextInt(9999) + 1);
        }
        System.out.println(customer1);
        for(int i = 0; i < customer2.getNumAccounts(); ++i){
            customer2.getAccount("OTP0001" + (i + 1)).deposit(rand.nextInt(9999) + 1);
        }
        System.out.println(customer2);
        customer1.closeAccount("OTP00001");
        customer2.closeAccount("OTP0001" + customer2.getNumAccounts());
        System.out.println(customer1);
        System.out.println(customer2);
    }
}
