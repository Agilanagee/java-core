package day02;

import java.util.Scanner;

public class D02P03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 =  sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 =  sc.nextDouble();
        
        System.out.print("Enter mathematical operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result= " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result=" + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result=" + result);
                break;
            case '/':
                if (num2!= 0) {
                    result = num1 / num2;
                    System.out.println("Result=" + result);
                } else {
                    System.out.println("Cannot divide");
                }
                break;
            default:
                System.out.println("Invalid operator symbol.");
        }
    }
}
