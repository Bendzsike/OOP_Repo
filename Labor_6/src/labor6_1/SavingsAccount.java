package labor6_1;

/**
 * takarékszámla
 */

public class SavingsAccount extends BankAccount {
    private double interestRate; //kamatláb

    public SavingsAccount(double interestRate) {
//        az ősosztály construktora automatikusan hívódik
        this.interestRate = interestRate;
    }

    public void addInterest() {
        this.balance += this.balance * this.interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
