package day03;

import java.util.HashMap;
import java.util.Scanner;

public class D03P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = findFirstRepeating(arr);
        if (result != -1) {
            System.out.println("Index of first repeating number: " + result);
        } else {
            System.out.println("No repeating number found.");
        }
    }

    public static int findFirstRepeating(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                return map.get(arr[i]);
            } else {
                map.put(arr[i], i);
            }
        }
        return -1;
    }
}



