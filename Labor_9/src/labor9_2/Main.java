package labor9_2;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Company comp = new Company("My Company");
        comp.hireAll("Labor_9/employees.csv");
        comp.printAll(System.out);
        comp.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getFirstName().equals(o2.getFirstName())) {
                    return o1.getLastName().compareTo(o2.getLastName());
                }
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        System.out.println("\nAlphabetically sorted:");
        comp.printAll(System.out);
    }
}
