package org.example;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 5, 6};

        System.out.println("Original array:");
        ArrayManipulation.printArray(numbers);

        SortingAlgorithms.bubbleSort(numbers);

        System.out.println("\nSorted array:");
        ArrayManipulation.printArray(numbers);
    }
}