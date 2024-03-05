package day02;

import java.util.Scanner;

public class D02P07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage out of 100: ");
        float percentage = sc.nextInt();

        if (percentage >= 60) {
            System.out.println("Grade: A");
        }
        else if (percentage >= 45) {
            System.out.println("Grade: B");
        }
        else if (percentage >= 35) {
            System.out.println("Grade: C");
        } 
        else  {
            System.out.println("Fail");
        }
    }
}
