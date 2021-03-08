package labor2_1;

public class Main {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("OTP00001");
//        System.out.println(account1.toString());
        System.out.println(account1.getAccountNumber() + " : " + account1.getBalance());
        System.out.println("Deposit: 1000 eur");
        account1.deposit(1000);
        System.out.println(account1.getAccountNumber() + " : " + account1.getBalance());
        System.out.println("Withdraw: 500 eur");
        if(account1.withdraw(500)){
            System.out.println("Withdraw successful!");
        } else{
            System.out.println("Withdraw unsuccessful!");
        }
        System.out.println(account1.getAccountNumber() + " : " + account1.getBalance());
        System.out.println("Withdraw: 1000 eur");
        if(account1.withdraw(1000)){
            System.out.println("Withdraw successful!");
        } else{
            System.out.println("Withdraw unsuccessful!");
        }
        System.out.println(account1.getAccountNumber() + " : " + account1.getBalance());

        BankAccount account2 = new BankAccount("OTP00002");
        System.out.println("Deposit: 2000 eur");
        account2.deposit(2000);
        System.out.println(account2.getAccountNumber() + " : " + account2.getBalance());

        BankAccount account3 = account2;
        System.out.println(account3.getAccountNumber() + " : " + account3.getBalance());

    }
}
