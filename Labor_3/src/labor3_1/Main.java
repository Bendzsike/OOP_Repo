package labor3_1;

public class Main {
    public static void main(String[] args){
        System.out.println("labor3_1");
        Customer customer1 = new Customer("John", "BLACK");
        System.out.println(customer1);
        customer1.setAccount(new BankAccount("OTP00001"));
        System.out.println(customer1);
        customer1.getAccount().deposit(1000);
        System.out.println(customer1);
//        customer1.closeAccount();
//        System.out.println(customer1);

        Customer customer2 = new Customer("Mary", "WHITE");
        System.out.println(customer2);
        customer2.setAccount(new BankAccount("OTP00002"));
        System.out.println(customer2);
        customer2.getAccount().deposit(1000);
        System.out.println(customer2);
//        customer2.closeAccount();
//        System.out.println(customer2);

        customer2.setLastName("BLACK");
        customer1.getAccount().deposit(customer2.getAccount().getBalance());
        customer2.setAccount(customer1.getAccount());
        System.out.println(customer1);
        System.out.println(customer2);
    }
}
