package org.example;


public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Белотелов", "Максим", "Сергеевич",
                "Позиция", "+79269376532", 10000, 34);

        employee1.printEmployeeInfo();

/*
        Создать массив из 5 сотрудников. Массив должен быть сразу инициализирован
    и не должно быть создано дополнительных переменных.
*/

        Employee[] array = {new Employee("Белотелов", "Максим", "Сергеевич",
                "Позиция", "+79269376532", 10000, 34),
                new Employee("Иванов", "Иван", "Иванович",
                        "Junior Developer", "+79269376532", 10000, 30),
                new Employee("Петров", "Петр", "Петрович",
                        "Middle Developer", "+79998887766", 11000, 46),
                new Employee("Денисов", "Денис", "Денисович",
                        "Senior Developer", "+79667776655", 14000, 36),
                new Employee("Кузнецов", "Алексей", "Александрович",
                        "Lead", "+79008007060", 16000, 50)
        };

        for(Employee emp : array) {
            emp.printEmployeeInfo();
        }

        Employee.addSalaryToOld(array, 45, 5000);

        System.out.println("================================");
        for(Employee emp : array) {
            emp.printEmployeeInfo();
        }

        System.out.println("Avg Age: " + Employee.getAvgAge(array));
        System.out.println("Avg Sal: " + Employee.getAvgSalary(array));
    }
}