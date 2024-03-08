package day03;

import java.util.Scanner;

public class D03P01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int length = input.length();
        System.out.println("Length of string is : " + length);
        String uppercaseString = input.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);
        boolean isPalindrome = isPalindrome(input);
        if (isPalindrome) {
            System.out.println("It string is a palindrome");
        } else {
            System.out.println("It string is not a palindrome");
        }
    }
    public static boolean isPalindrome(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equalsIgnoreCase(reversed.toString());
    }
}
