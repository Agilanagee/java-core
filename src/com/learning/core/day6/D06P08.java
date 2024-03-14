package com.learning.core.day6;
import java.util.*;

class Car3 implements Comparable<Car3> {
    private String name1;
    private double price1;

    public Car3(String name, double price) {
        this.name1 = name1;
        this.price1 = price1;
    }

    @Override
    public String toString() {
        return name1 + ": $" + price1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name1, price1);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return Double.compare(car.price1, price1) == 0 && Objects.equals(name1, car.name1);
    }

    @Override
    public int compareTo(Car3 otherCar) {
        return Double.compare(this.price1, otherCar.price1);
    }
}

public class D06P08 {
    public static void main(String[] args) {
        
        TreeMap<Car, String> carDetails = new TreeMap<>();

       
        carDetails.put(new Car("Bugatti", 80050.0), "1");
        carDetails.put(new Car("Swift", 305000.0), "2");
        carDetails.put(new Car("Audi", 600100.0), "3");
        carDetails.put(new Car("Benz", 900000.0), "4");

        
        Map.Entry<Car, String> greatestEntry = carDetails.pollLastEntry();
        System.out.println("Car with the greatest price removed: " + greatestEntry.getValue() + ". " + greatestEntry.getKey());

        
        System.out.println("Updated Car Details after removal:");
        for (Map.Entry<Car, String> entry : carDetails.entrySet()) {
            System.out.println(entry.getValue() + ". " + entry.getKey());
        }
    }
}
