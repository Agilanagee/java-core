package com.learning.core.day6;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

import java.util.Objects;

public class Employee{
	//int employeeid;
	String name;
	String dept;
	String desig;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dept, desig, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dept, other.dept) && Objects.equals(desig, other.desig)
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return name + " " + dept + " " + desig;
	}
	public Employee() {
		super();
	}
	public Employee(String name, String dept, String desig) {
		super();
		this.name = name;
		this.dept = dept;
		this.desig = desig;
	}
	
	
}

public class D06P14 {
	public static void main(String[] args)
	{
		Hashtable<Integer,Employee> ht=new Hashtable<Integer,Employee>();
		Employee e1=new Employee("Daniel","Analyst","L&D");
		Employee e2=new Employee("Thomas","Tester","Testing");
		Employee e3=new Employee("Robert","Product Manager","Development");
		Employee e4=new Employee("Grace","Tech Support","HR");
		Employee e5=new Employee("Charles","QA Lead","Testing");
		Employee e6=new Employee("Henry","Accountant","Finance");
		ht.put(1001, e1);
		ht.put(1002, e2);
		ht.put(1003, e3);
		ht.put(1004, e4);
		ht.put(1005, e5);
		ht.put(1006, e6);
		TreeMap<Integer,Employee> tm=new TreeMap<>(Collections.reverseOrder());
		tm.putAll(ht);
		for(Entry<Integer,Employee> e: tm.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
