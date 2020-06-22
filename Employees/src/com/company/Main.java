package com.company;
/*
 * @author Alexander Panyshchev
 * @since 6/22/20
 * @version 1.0
 *Task:
    1. Create two appropriate classes and 5 objects of each one.
    2. Calculate the total salary of a month.
    3. Find the highest salary employee.
    4. Find he lowest salary employee
    5. The average salary.
    6. Who get more salary, part-time or full-time employees?
 */

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //FullTimeEmployees
        FullTimeEmployee employee1 = new FullTimeEmployee(0,"Employee1",1000.0);
        FullTimeEmployee employee2 = new FullTimeEmployee(1,"Employee2",1200.0);
        FullTimeEmployee employee3 = new FullTimeEmployee(2,"Employee3",1700.0);
        FullTimeEmployee employee4 = new FullTimeEmployee(3,"Employee4",2000.0);
        FullTimeEmployee employee5 = new FullTimeEmployee(4,"Employee5",2300.0);
        //PartTimeEmployees
        PartTimeEmployee employee6 = new PartTimeEmployee(5,"Employee6", 10.0,15);
        PartTimeEmployee employee7 = new PartTimeEmployee(6,"Employee7", 12.0,23);
        PartTimeEmployee employee8 = new PartTimeEmployee(7,"Employee8", 13.0,45);
        PartTimeEmployee employee9 = new PartTimeEmployee(8,"Employee9", 20.0,8);
        PartTimeEmployee employee10 = new PartTimeEmployee(9,"Employee10", 125.0,2);

        //Adding all employees to list
        List<IEmployee> allEmployees = new LinkedList<>();
        allEmployees.add(employee1);
        allEmployees.add(employee2);
        allEmployees.add(employee3);
        allEmployees.add(employee4);
        allEmployees.add(employee5);
        allEmployees.add(employee6);
        allEmployees.add(employee7);
        allEmployees.add(employee8);
        allEmployees.add(employee9);
        allEmployees.add(employee10);

        //Calculating total salary of a month.
        double totalSalaryByMonth = allEmployees.stream().mapToDouble(IEmployee::getSalary).sum();
        System.out.println("Total salary of a month: "+totalSalaryByMonth);

        // Finding the highest salary employee.
        IEmployee highestSalaryEmployee = allEmployees.stream().max(Comparator.comparing(IEmployee::getSalary)).orElse(null);
        System.out.println("Highest salary employee: " + highestSalaryEmployee.toString());

        // Finding the lowest salary employee.
        IEmployee lowestSalaryEmployee = allEmployees.stream().min(Comparator.comparing(IEmployee::getSalary)).orElse(null);
        System.out.println("Lowest salary employee: " + lowestSalaryEmployee.toString());

        // Calculating the average salary.
        double avrSalary = totalSalaryByMonth/allEmployees.size();
        System.out.println("The average salary: "+ avrSalary);

        //Checking for most expensive type of employees
        double partTimeEmployeesSalary = allEmployees.stream().filter(item -> item instanceof PartTimeEmployee).mapToDouble(IEmployee::getSalary).sum();
        double fullTimeEmployeesSalary = allEmployees.stream().filter(item -> item instanceof FullTimeEmployee).mapToDouble(IEmployee::getSalary).sum();
        System.out.println((partTimeEmployeesSalary>fullTimeEmployeesSalary?"Part time guys": "Full time guys")+" get more salary.");
    }
}
