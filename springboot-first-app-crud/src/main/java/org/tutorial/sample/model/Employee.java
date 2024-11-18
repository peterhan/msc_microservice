package org.tutorial.sample.model;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
public class Employee {

    // private variables or data members of pojo class
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private double salary;
    private Employee officer;
    private boolean married;

    public static void main(String[] args) {
        Employee ee=new Employee();
        System.out.println("ee = " + ee.getFirstName());
    }


}