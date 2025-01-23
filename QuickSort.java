/*
   NAME: BISMA RIZWAN
   ROLL NO: SE2 231069
   QUESTION NO : 02
   Write a program to implement the Quick Sort algorithm using recursion. Your program
should:
     • Accept an array of integers as input.
     • Sort the array using Quick Sort.
      • Display the sorted array.
 */

import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(array, start, end);
            quickSort(array, start, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, end);
        }
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int index = start - 1;

        for (int j = start; j < end; j++) {
            if (array[j] < pivot) {
                index++;
                int temp = array[index];
                array[index] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[index + 1];
        array[index + 1] = array[end];
        array[end] = temp;

        return index + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Original Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        quickSort(array, 0, n - 1);

        System.out.println("\nSorted Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

