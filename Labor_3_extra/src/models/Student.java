package models;

import enums.Major;

public class Student {
    private String firstName;
    private String lastName;
    private String neptunCode;
    private Major major;

    public Student(String firstName, String lastName, String neptunCode, Major major){
        this.firstName = firstName;
        this.lastName = lastName;
        this.neptunCode = neptunCode;
        this.major = major;
    }

    public String toString(){
        return firstName + ' ' + lastName + " (" + neptunCode + ")\n";
    }
}
