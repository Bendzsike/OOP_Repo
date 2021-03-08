package labor4_2;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString(){
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(BankAccount account : accounts){
            result.append("\t" + account.toString() + "\n");
        }
        return result.toString();
    }
}
