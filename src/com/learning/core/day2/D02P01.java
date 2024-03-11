package com.learning.core.day2;


import java.util.Scanner;

public class D02P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 12: ");
        int monthNumber = scanner.nextInt();

        if (monthNumber >= 1 && monthNumber <= 12) {
            String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
            };
            String monthName = months[monthNumber - 1];
            System.out.println("Month" + " : " + monthName);
        } 
        else 
        {
            System.out.println("Invalid input");
        }
    }
}