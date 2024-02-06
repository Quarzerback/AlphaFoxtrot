package org.example;

/**
 * Utility class for array manipulation operations.
 */
public class ArrayManipulation {

    /**
     * Prints the elements of the given array.
     *
     * @param array The array to be printed.
     */
    public static void printArray(int[] array) {
        // Iterate through the array and print each element followed by a space
        for (int num : array) {
            System.out.print(num + " ");
        }
        // Move to the next line after printing all elements
        System.out.println("");
    }

    /**
     * Swaps the elements at the specified indices in the given array.
     *
     * @param array  The array in which elements will be swapped.
     * @param index1 The index of the first element to be swapped.
     * @param index2 The index of the second element to be swapped.
     */
    public static void swap(int[] array, int index1, int index2) {
        // Temporary variable to hold the value of the first element
        int temp = array[index1];
        // Swap the values of the elements at the specified indices
        array[index1] = array[index2];
        array[index2] = temp;
    }
}