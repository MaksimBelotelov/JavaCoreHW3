package org.example;

/*
        Создать класс ”Сотрудник” с полями: ФИО, должность, телефон,
    зарплата, возраст;
        Написать функцию выводящую всю доступную информацию об объекте с использованием
    форматирования строк;

*/

public class Employee {
    private String lastName;
    private String firstName;
    private String surname;
    private String position;
    private String phoneNumber;
    private double salary;
    private int age;

    public Employee(String lastName, String firstName, String surname,
                    String position, String phoneNumber, double salary, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.surname = surname;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public String getSurname() { return surname; }
    public String getPosition() { return position; }
    public String getPhoneNumber() { return phoneNumber; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }

    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setPosition(String position) { this.position = position; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setAge(int age) { this.age = age; }

    public void printEmployeeInfo() {
        System.out.printf("Фамилия:%s\nИмя:%s\nДолжность:%s\nТелефон:%s\nДоход:%.2f\nВозраст:%d\n\n",
                lastName, firstName, position, phoneNumber, salary, age);
    }

    public static void addSalaryToOld(Employee[] array, int age, int additional) {
        for(Employee emp: array)
            if(emp.getAge() > age)
                emp.setSalary(emp.getSalary() + additional);
    }

    public static int getAvgAge(Employee[] emps) {
        int res = 0;
        for(Employee emp: emps)
            res += emp.getAge();
        return res / emps.length;
    }

    public static double getAvgSalary(Employee[] emps) {
        double res = 0;
        for (Employee emp: emps)
            res += emp.getSalary();
        return res / emps.length;
    }
}
