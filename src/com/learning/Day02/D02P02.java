package day02;


import java.util.Scanner;

public class D02P02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Even numbers upto " + n + ":");
        
        if (n < 1) {
            System.out.println("Please enter valid number");
        } else {
            for (int i = 2; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}