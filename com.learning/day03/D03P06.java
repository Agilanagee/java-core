package day03;

import java.util.Scanner;

public class D03P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the number of last vowels to count: ");
        int n = scanner.nextInt();
        String lastNVowels = getLastNVowels(input, n);
        if (lastNVowels != null) {
            System.out.println("Last " + n + " vowels found: " + lastNVowels);
        } else {
            System.out.println("Mismatch in vowel count.");
        }

        scanner.close();
    }

    public static String getLastNVowels(String input, int n) {
        StringBuilder vowels = new StringBuilder();
        int count = 0;

        for (int i = input.length() - 1; i >= 0 && count < n; i--) {
            char c = Character.toLowerCase(input.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels.insert(0, c);
                count++;
            }
        }

        if (count < n) {
            return null;
        }

        return vowels.toString();
    }
}


