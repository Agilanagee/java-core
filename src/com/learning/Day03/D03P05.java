package day03;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D03P05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        List<List<Integer>> combinations = findCombinations(array, k);

        System.out.println("Distinct combinations of size " + k + ":");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }

    }

    public static List<List<Integer>> findCombinations(int[] array, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(array, k, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] array, int k, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < array.length; i++) {
            current.add(array[i]);
            backtrack(array, k, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}