package org.example;

/**
 * Main class to demonstrate array manipulation and sorting algorithms.
 */
public class Main {
    /**
     * Entry point of the program.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Array of numbers to be manipulated and sorted
        int[] numbers = {5, 2, 9, 1, 5, 6};

        // Print the original array
        System.out.println("Original array:");
        ArrayManipulation.printArray(numbers);

        // Sort the array using the Bubble Sort algorithm
        SortingAlgorithms.bubbleSort(numbers);

        // Print the sorted array
        System.out.println("\nSorted array:");
        ArrayManipulation.printArray(numbers);
    }
}