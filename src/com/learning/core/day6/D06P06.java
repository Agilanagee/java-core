package com.learning.core.day6;

import java.util.TreeMap;
import java.util.Map;
import java.util.Comparator;

class Car1 implements Comparable<Car1> {
	private String name;
	private double price;

	public Car1(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Car1 otherCar) {
		return Double.compare(this.price, otherCar.price);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Car1 car = (Car1) obj;
		return name.equals(car.name);
	}

	@Override
	public String toString() {
		return name + " " + price;
	}
}

public class D06P06 {
	public static void main(String[] args) {

		TreeMap<Car, String> carMap = new TreeMap<>(Comparator.reverseOrder());

		carMap.put(new Car("Bugatti", 80050.0), "Bugatti");
		carMap.put(new Car("Swift", 305000.0), "Swift");
		carMap.put(new Car("Audi", 600100.0), "Audi");
		carMap.put(new Car("Benz", 900000.0), "Benz");

		System.out.println("Car Prices in Reverse Order:");
		for (Map.Entry<Car, String> entry : carMap.entrySet()) {
			System.out.println(entry.getKey().toString());
		}
	}
}
