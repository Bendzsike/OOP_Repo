package labor6_1;

/**
 * folyószámla
 */

public class CheckingAccount extends BankAccount{
    private double overdraftLimit; //hitelkeret

    public CheckingAccount(double overdraftLimit) {
//        itt meghívódik az ősosztály construktora
//        mert van implicit definíciója (paramétermentes construktor)
        this.overdraftLimit = overdraftLimit;
    }

    public boolean withdraw(double amount) {
        if(amount > overdraftLimit && amount > balance){
            return false;
        }
        balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }
}
