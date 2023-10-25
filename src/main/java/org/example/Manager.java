package org.example;

public class Manager extends Employee {
    public Manager(String lastName, String firstName, String surname, String position,
                   String phoneNumber, double salary, String birthDay, int age) {
        super(lastName, firstName, surname, position, phoneNumber, salary, birthDay, age);
    }

    public static void addSalaryToOld(Employee[] array, int age, int additional) {
        for(Employee emp: array)
            if(emp.getAge() > age && !(emp instanceof Manager))
                emp.setSalary(emp.getSalary() + additional);
    }
}
