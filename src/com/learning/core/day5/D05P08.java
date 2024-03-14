package com.learning.core.day5;

import java.util.TreeSet;

class Person2 implements Comparable<Person> {
	private int ID;
	private String name;
	private int age;
	private double salary;

	public Person2(int id, String name, int age, double salary) {
		this.ID = ID;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return ID;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Person otherPerson) {
		return Integer.compare(this.ID, otherPerson.ID);
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Person2 person = (Person2) obj;
		return ID == person.ID;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class D05P08 {
	public static void main(String[] args) {

		TreeSet<Person> personSet = new TreeSet<>();

		personSet.add(new Person(101, "Jerry", 30, 50000.0));
		personSet.add(new Person(102, "Smith", 28, 60000.0));
		personSet.add(new Person(103, "Popeye", 35, 55000.0));
		personSet.add(new Person(104, "Jones", 32, 52000.0));
		personSet.add(new Person(105, "John", 40, 70000.0));
		personSet.add(new Person(106, "Tom", 25, 48000.0));

		for (Person person : personSet) {
			String formattedName = person.getName().substring(0, 1).toUpperCase()
					+ person.getName().substring(1).toLowerCase();
			System.out.println(formattedName);
		}
	}
}