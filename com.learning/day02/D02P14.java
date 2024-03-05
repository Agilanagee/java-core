package day02;

import java.util.Scanner;

public class D02P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();
        double result = calculatePower(base, exponent);
        System.out.println(base + "power of " + exponent + " is: " + result);
    }
    public static double calculatePower(double base, int exponent) {
        double result = 1;

        if (exponent >= 0) {
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
        } 
        else {
            for (int i = 0; i < -exponent; i++) {
                result /= base;
            }
        }
        return result;
    }
}

