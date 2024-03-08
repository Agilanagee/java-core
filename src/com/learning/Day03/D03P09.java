package day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D03P09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter the strings separated by space: ");
        String[] strings = scanner.nextLine().split(" ");
        List<String> result = formCircle(strings);
        if (result != null) {
            System.out.println("Order of strings in circle: " + String.join(" ->", result));
            System.out.println("Yes, a circle can be formed.");
        } else {
            System.out.println("No, a circle cannot be formed.");
        }
    }

    public static List<String> formCircle(String[] strings) {
        List<String> result = new ArrayList<>();
        result.add(strings[0]);
        boolean[] visited = new boolean[strings.length];
        visited[0] = true;

        if (formCircleHelper(strings, result, visited, strings[0].charAt(strings[0].length() - 1))) {
            return result;
        }

        return null;
    }

    private static boolean formCircleHelper(String[] strings, List<String> result, boolean[] visited, char lastChar) {
        if (result.size() == strings.length) {
            // Check if the last string can connect to the first string
            String lastString = result.get(result.size() - 1);
            if (lastString.charAt(lastString.length() - 1) == result.get(0).charAt(0)) {
                return true;
            } else {
                return false;
            }
        }

        for (int i = 1; i < strings.length; i++) {
            if (!visited[i] && strings[i].charAt(0) == lastChar) {
                visited[i] = true;
                result.add(strings[i]);
                if (formCircleHelper(strings, result, visited, strings[i].charAt(strings[i].length() - 1))) {
                    return true;
                }
                visited[i] = false;
                result.remove(result.size() - 1);
            }
        }

        return false;
    }
}

