package com.company;

import java.util.Objects;

/*
 * @author Alexander Panyshchev
 * @since 6/23/20
 * @version 1.0
 */
public class Company {
    // parent for this company nullable, when there is no parent for this company
    private Company parent;
    private long employeesCount;

    //@param parent means parent class for this one
    //@param employeesCount means count of employees in this company
    public Company(Company parent, long employeesCount) {
        this.parent = parent;
        this.employeesCount = employeesCount;
    }

    public Company() {
    }

    public Company getParent() {
        return parent;
    }

    public void setParent(Company parent) {
        this.parent = parent;
    }

    public long getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(long employeesCount) {
        this.employeesCount = employeesCount;
    }

    @Override
    public String toString() {
        return "Company{" +
                "parent=" + parent +
                ", employeesCount=" + employeesCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return employeesCount == company.employeesCount &&
                Objects.equals(parent, company.parent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parent, employeesCount);
    }
}
