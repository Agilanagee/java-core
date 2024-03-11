package com.learning.core.day2;

import java.util.Scanner;

public class D02P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int fib1 = 0, fib2 = 1;

        System.out.println("Fibonacci series up to " + n + "th number:");
        System.out.print(fib1 + " ");

        for (int i = 1; i < n; i++) {
            System.out.print(fib2 + " ");
            int nextFib = fib1 + fib2;
            fib1 = fib2;
            fib2 = nextFib;
        }  
    }
}
