package com.learning.core.day6;

import java.util.*;

class Car4 implements Comparable<Car4> {
    public static final double price1 = 0;
	public static final Object name1 = null;
	String name;
    private double price;

    public Car4(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Override toString method
    @Override
    public String toString() {
        return name + " " + price;
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Car4 car = (Car4) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    // Override compareTo method for natural ordering based on price
    @Override
    public int compareTo(Car4 other) {
        return Double.compare(this.price, other.price);
    }
}

public class D06P09 {
    public static void main(String[] args) {
        TreeMap<String, Car4> carMap = new TreeMap<>();
        
        // Predefined car details
        Car4 car1 = new Car4("Reva", 80050.0);
        Car4 car2 = new Car4("Toyota", 50000.0);
        Car4 car3 = new Car4("Honda", 60000.0);
        Car4 car4 = new Car4("BMW", 90000.0);
        
        // Populate TreeMap with car details
        carMap.put(car1.getName(), car1);
        carMap.put(car2.getName(), car2);
        carMap.put(car3.getName(), car3);
        carMap.put(car4.getName(), car4);
        
        // Display TreeMap before replacing value
        System.out.println("TreeMap before replacing value:");
        for (Map.Entry<String, Car4> entry : carMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        // Take input for new price
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter new price: ");
        double newPrice = scanner.nextDouble();
        
        
        String keyToReplace = "Reva";
        carMap.put(keyToReplace, new Car4(keyToReplace, newPrice));
        
        
        System.out.println("\nTreeMap after replacing value:");
        for (Map.Entry<String, Car4> entry : carMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

