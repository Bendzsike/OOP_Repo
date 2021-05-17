package GridPane.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Student {
    private String firstName;
    private String lastName;
    private String email;

    public Student() {
        firstName = "";
        lastName = "";
        email = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void save() {
        try {
            PrintStream printStream = new PrintStream(new File("students.csv"));
            printStream.println("First name: " + firstName);
            printStream.println("Last name: " + lastName);
            printStream.println("Email: " + email);
            printStream.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
