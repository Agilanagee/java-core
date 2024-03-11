package com.learning.core.day2;

import java.util.Scanner;

public class D02P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int reversedNumber = reverseDigits(number);
        System.out.println("Reversed num: " + reversedNumber);
    }

    public static int reverseDigits(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}
