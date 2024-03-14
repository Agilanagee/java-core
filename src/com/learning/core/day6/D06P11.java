package com.learning.core.day6;
import java.util.Hashtable;
import java.util.Scanner;

class Emp
{
    protected int id;
    private String name;
    private String department;
    private String designation;

    public Emp(int id, String name, String department, String designation)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    public Emp(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	public void Employee(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	public int getId()
    {
        return id;
    }

    @Override
    public String toString() 
    {
        return id + " " + name + " " + designation + " " + department;
    }

    @Override
    public int hashCode() 
    {
        return id;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Emp employee = (Emp) obj;
        return id == employee.id;
    }
}

public class D06P11 
{

  public static void main(String[] args) 
  {
        EmployeeDetails e1 = new EmployeeDetails(1001, "Daniel", "L&D", "Analyst");
        EmployeeDetails e2 = new EmployeeDetails(1002, "Thomas", "Testing", "Tester");
        EmployeeDetails e3 = new EmployeeDetails(1003, "Robert", "Development", "Product Manager");
        EmployeeDetails e4 = new EmployeeDetails(1004, "Grace", "HR", "Tech Support");
        Hashtable<Integer, EmployeeDetails> employeeTable = new Hashtable<>();
        employeeTable.put(e1.getId(), e1);
        employeeTable.put(e2.getId(), e2);
        employeeTable.put(e3.getId(), e3);
        employeeTable.put(e4.getId(), e4);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee id to search: ");
        int searchId = scanner.nextInt();
        EmployeeDetails searchEmployee = employeeTable.get(searchId);
        if (searchEmployee != null) 
        {
            System.out.println(searchEmployee);
        } 
        else 
        {
            System.out.println("Employee not found.");
        }
    }
}
