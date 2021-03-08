package labor4_2;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber){
        // shadowing = accountNumber - lokális változó
        // this.accountNumber - ennek az obiektumnak a változója
        this.accountNumber = accountNumber;
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

    public String toString(){
        return "Account: " + getAccountNumber() + " with balance: " + getBalance();
    }
}