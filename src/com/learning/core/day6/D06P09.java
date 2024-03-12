package com.learning.core.day6;

import java.util.*;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
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
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    // Override compareTo method for natural ordering based on price
    @Override
    public int compareTo(Car other) {
        return Double.compare(this.price, other.price);
    }
}

public class D06P09 {
    public static void main(String[] args) {
        TreeMap<String, Car> carMap = new TreeMap<>();
        
        // Predefined car details
        Car car1 = new Car("Reva", 80050.0);
        Car car2 = new Car("Toyota", 50000.0);
        Car car3 = new Car("Honda", 60000.0);
        Car car4 = new Car("BMW", 90000.0);
        
        // Populate TreeMap with car details
        carMap.put(car1.getName(), car1);
        carMap.put(car2.getName(), car2);
        carMap.put(car3.getName(), car3);
        carMap.put(car4.getName(), car4);
        
        // Display TreeMap before replacing value
        System.out.println("TreeMap before replacing value:");
        for (Map.Entry<String, Car> entry : carMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        // Take input for new price
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter new price: ");
        double newPrice = scanner.nextDouble();
        
        // Replace the value mapped by the specified key with the new value
        String keyToReplace = "Reva";
        carMap.put(keyToReplace, new Car(keyToReplace, newPrice));
        
        // Display TreeMap after replacing value
        System.out.println("\nTreeMap after replacing value:");
        for (Map.Entry<String, Car> entry : carMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

