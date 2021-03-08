package models;

import enums.Degree;
import enums.Department;

public class Teacher {
    private String firstName;
    private String lastName;
    private Degree degree;
    private Department department;
    private int currentNumberOfTeachers;
    private int teacherID;

    public Teacher(String firstName, String lastName, Degree degree, Department department){
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
        this.department = department;
    }

    public String toString(){
        return firstName + ' ' + lastName + " - " + degree + " from " + department + " department\n";
    }
}
