package labor5_1;

public class BankAccount {
    private double balance;
    private final String accountNumber;
    public static final String PREFIX = "OTP";
    private static int numAccounts = 0;
    public static final int ACCOUNT_NUMBER_LENGTH = 10;

    public BankAccount(){
        ++numAccounts;
        this.accountNumber = generateAccountNumber();
    }

    private static String generateAccountNumber() {
        String result = PREFIX;
        for(int i = 0; i < (ACCOUNT_NUMBER_LENGTH - PREFIX.length() - String.valueOf(numAccounts).length()); ++i) {
            result += "0";
        }
        return result + numAccounts;
    }

    //getter - lekérdező műveletek
    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            return;
        }
        balance += amount;
    }

    public boolean withdraw(double amount){
        if(amount > balance){
            return false;
        }
        balance -= amount;
        return true;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public String toString(){
        return "Account: " + getAccountNumber() + " with balance: " + getBalance();
    }
}