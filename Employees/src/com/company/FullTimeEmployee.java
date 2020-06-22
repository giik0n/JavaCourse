package com.company;

import java.util.Objects;

/*
 * @author Alexander Panyshchev
 * @since 6/22/20
 * @version 1.0
 * class for Full Time Employee
 */
public class FullTimeEmployee implements IEmployee {
    private int employeeId;
    private String employeeName;
    private double employeeSalaryByMonth;

    public FullTimeEmployee(int employeeId, String employeeName, double employeeSalaryByMonth) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalaryByMonth = employeeSalaryByMonth;
    }

    public FullTimeEmployee() {
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

    public double getEmployeeSalaryByMonth() {
        return employeeSalaryByMonth;
    }

    public void setEmployeeSalaryByMonth(double employeeSalaryByMonth) {
        this.employeeSalaryByMonth = employeeSalaryByMonth;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee - " +
                "id = " + employeeId +
                ", Name = '" + employeeName + '\'' +
                ", Salary By Month = " + employeeSalaryByMonth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullTimeEmployee that = (FullTimeEmployee) o;
        return employeeId == that.employeeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }

    @Override
    public double getSalary() {
        return getEmployeeSalaryByMonth();
    }
}
