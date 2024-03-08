package day02;

import java.util.Scanner;

public class D02P11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number of rows:");
        int rows = scanner.nextInt();
        
        System.out.println("Pattern:");
        displayPattern(rows);
        
    }
    
    public static void displayPattern(int rows) {
    	int n=0;
        for (int i = 1; i <= rows; i++) {
        	n+=1;
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}


