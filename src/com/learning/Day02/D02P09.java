package day02;

import java.util.Scanner;

public class D02P09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.println("Cubes of numbers up to " + n + ":");
        displayCubes(n);
    }

    public static void displayCubes(int n) {
        for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println(i + "^3 = " + cube);
        }
    }
}

