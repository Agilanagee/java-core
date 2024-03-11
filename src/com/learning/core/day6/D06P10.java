package com.learning.core.day6;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Override toString method
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Designation: " + designation;
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id, name, department, designation);
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee employee = (Employee) obj;
        return id == employee.id && Objects.equals(name, employee.name)
                && Objects.equals(department, employee.department) && Objects.equals(designation, employee.designation);
    }
}

public class D06P10 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();
        
        
        Employee emp1 = new Employee(101, "John", "Engineering", "Software Engineer");
        Employee emp2 = new Employee(102, "Alice", "HR", "HR Manager");
        Employee emp3 = new Employee(103, "Bob", "Marketing", "Marketing Executive");
        Employee emp4 = new Employee(104, "Emily", "Finance", "Financial Analyst");
        
        
        employeeTable.put(emp1.getId(), emp1);
        employeeTable.put(emp2.getId(), emp2);
        employeeTable.put(emp3.getId(), emp3);
        employeeTable.put(emp4.getId(), emp4);
        
        
        boolean isEmpty = employeeTable.isEmpty();
        
        
        System.out.println(isEmpty);
    }
}

