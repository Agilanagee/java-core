package com.learning.core.day9;

public class D09P01 {
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        int length = array.length;
        
        System.out.println("Original Array:");
        printArray(array);
        
        quickSort(array, 0, length - 1);
        
        System.out.println("Sorted Array:");
        printArray(array);
    }
    
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }
    
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
               
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        
        return i + 1;
    }
    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

