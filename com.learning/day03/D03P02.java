package day03;

import java.util.Scanner;

public class D03P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArray = {8, 13, 15, 28, 43};
        System.out.print("Enter first number (between 1 and 40): ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number (between 1 and 40): ");
        int num2 = scanner.nextInt();
        boolean foundNum1 = false;
        boolean foundNum2 = false;

        for (int num : numbersArray) {
            if (num == num1) {
                foundNum1 = true;
            }
            if (num == num2) {
                foundNum2 = true;
            }
        }
        if (foundNum1 && foundNum2) {
            System.out.println("Bingo");
        } 
        else {
            System.out.println("Numbers not found together in the array.");
        }
    }
}

