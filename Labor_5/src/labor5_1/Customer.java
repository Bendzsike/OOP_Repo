package labor5_1;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    private final int id;
    public static int counter = 0;

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        ++counter;
        id = counter;

    }

    public int getNumAccounts() {
        return accounts.size();
    }

    public void closeAccount(String accountNumber){
        for(BankAccount account : accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                accounts.remove(account);
                return;
            }
        }
    }

    public void addAccount(BankAccount newAccount){
        if(accounts == null){
            return;
        }
        accounts.add(newAccount);
    }

    public BankAccount getAccount(String accountNumber){
        for(BankAccount account : accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getId() {
        return id;
    }

    public ArrayList<String> getAccountNumbers() {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < getNumAccounts(); ++i) {
            result.add(accounts.get(i).getAccountNumber());
        }
        return result;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString(){
        StringBuffer result = new StringBuffer();
        result.append("ID:\t\t" + id + "\nName:\t" + firstName + ' ' + lastName + "\nAccounts:\n");
        for(BankAccount account : accounts){
            result.append("\t" + account.toString() + "\n");
        }
        return result.toString();
    }
}
