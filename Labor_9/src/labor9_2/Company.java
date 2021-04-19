package labor9_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    String name;
    ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee e) {
        employees.add(e);
    }

    public void hireAll(String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(", ");
                if(values.length == 6) {
                    hire(new Employee(values[0].trim(), values[1].trim(), Double.parseDouble(values[2].trim()), new MyDate(Integer.parseInt(values[3].trim()), Integer.parseInt(values[4].trim()), Integer.parseInt(values[5].trim()))));
                }else if(values.length == 7) {
                    hire(new Manager(values[0].trim(), values[1].trim(), Double.parseDouble(values[2].trim()), new MyDate(Integer.parseInt(values[3].trim()), Integer.parseInt(values[4].trim()), Integer.parseInt(values[5].trim())), values[6].trim()));
                }
            }
        } catch(FileNotFoundException e) {
            System.out.println("Error with the file!");
            e.printStackTrace();
        }
    }

    public void printAll(PrintStream ps) {
        for(Employee e : employees) {
            ps.println(e);
        }
    }

    public void sortByComparator(Comparator<Employee> comp) {
        Collections.sort(employees, comp);
    }
}
