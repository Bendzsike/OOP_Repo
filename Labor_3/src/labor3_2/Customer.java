package labor3_2;

import labor3_1.BankAccount;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount[] accounts = new BankAccount[MAX_ACCOUNTS];
    private int numAccounts;
    public static final int MAX_ACCOUNTS = 10;

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void closeAccount(String accountNumber){
        for(int i = 0; i < numAccounts; ++i){
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                accounts[i] = accounts[numAccounts - 1];
                --numAccounts;
                break;
            }
        }
    }

    public void addAccount(BankAccount newAccount){
        if(accounts == null){
            return;
        }

        if(numAccounts < MAX_ACCOUNTS){
            accounts[numAccounts] = newAccount;
            ++numAccounts;
        }else{
            System.out.println("Tul sok szamla!");
            return;
        }
    }

    public BankAccount getAccount(String accountNumber){
        for(int i = 0; i < numAccounts; ++i){
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                return accounts[i];
            }
        }
        return null;
    }

    public int getNumAccounts(){
        return numAccounts;
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
        for(int i = 0; i < numAccounts; ++i){
            result.append("\t" + accounts[i].toString() + "\n");
        }
        return result.toString();
    }
}
