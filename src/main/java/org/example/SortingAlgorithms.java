package org.example;

/**
 * Class containing sorting algorithms.
 */
public class SortingAlgorithms {

    /**
     * Sorts an array using the Bubble Sort algorithm.
     *
     * @param array The array to be sorted.
     */
    public static void bubbleSort(int[] array) {
        // Length of the array
        int length = array.length;
        // Flag to indicate whether any elements were swapped in the last iteration
        boolean swapped;

        // Repeat until no elements are swapped in an iteration
        do {
            // Reset swapped flag for each iteration
            swapped = false;

            // Iterate through the array and compare adjacent elements
            for (int i = 1; i < length; i++) {
                // If the previous element is greater than the current element, swap them
                if (array[i - 1] > array[i]) {
                    // Call the swap method from ArrayManipulation class
                    ArrayManipulation.swap(array, i - 1, i);
                    // Set the swapped flag to true
                    swapped = true;
                }
            }
            // Decrease the length to exclude the already sorted elements
            length--;
        } while (swapped); // Continue until no elements are swapped in the entire pass
    }
}