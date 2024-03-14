package com.learning.core.day6;

import java.util.TreeMap;
import java.util.Map;

class Car2 implements Comparable<Car2> {
	private String name;
	private double price;

	public Car2(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Car2 otherCar) {
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

		Car2 car = (Car2) obj;
		return name.equals(car.name);
	}

	@Override
	public String toString() {
		return name + " " + price;
	}
}

public class D06P07 {
	public static void main(String[] args) {
	
		TreeMap<Car, String> carMap = new TreeMap<>();

		carMap.put(new Car("Benz", 900000.0), "Benz");
		carMap.put(new Car("Audi", 600100.0), "Audi");
		carMap.put(new Car("Swift", 305000.0), "Swift");
		carMap.put(new Car("Bugatti", 80050.0), "Bugatti");

		
		System.out.println("Car Details in Natural Ordering");
		for (Map.Entry<Car, String> entry : carMap.entrySet()) {
			System.out.println(entry.getKey().toString());
		}
	}
}
