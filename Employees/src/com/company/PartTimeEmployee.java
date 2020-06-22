package com.company;

import java.util.Objects;

/*
 * @author Alexander Panyshchev
 * @since 6/22/20
 * @version 1.0
 * class for Part-Time Employee
 */
public class PartTimeEmployee implements IEmployee {
    private int employeeId;
    private String employeeName;
    private double employeeSalaryPerHour;
    private int workingHours;

    //@param employeeId means id of employee
    //@param employeeName means Name of employee
    //@param employeeSalaryPerHour means Salary per one hour of employee
    //@param workingHours means count of working hours pf employee
    public PartTimeEmployee(int employeeId, String employeeName, double employeeSalaryPerHour, int workingHours) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalaryPerHour = employeeSalaryPerHour;
        this.workingHours = workingHours;
    }

    public PartTimeEmployee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalaryPerHour() {
        return employeeSalaryPerHour;
    }

    public void setEmployeeSalaryPerHour(double employeeSalaryPerHour) {
        this.employeeSalaryPerHour = employeeSalaryPerHour;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee - " +
                "id = " + employeeId +
                ", Name = '" + employeeName + '\'' +
                ", Salary Per Hour = " + employeeSalaryPerHour +
                ", Working Hours = " + workingHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartTimeEmployee that = (PartTimeEmployee) o;
        return employeeId == that.employeeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }

    @Override
    public double getSalary(){
        return employeeSalaryPerHour*workingHours;
    }
}
