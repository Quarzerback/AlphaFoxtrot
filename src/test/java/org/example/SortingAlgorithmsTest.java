package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for the SortingAlgorithms class.
 */
public class SortingAlgorithmsTest {

    /**
     * Test the bubbleSort method to ensure it correctly sorts an array.
     */
    @Test
    public void bubbleSort_shouldSortArray() {
        // Given an unsorted array of integers
        int[] unsortedArray = {5, 2, 9, 1, 5, 6};
        // Expected sorted array
        int[] expectedSortedArray = {1, 2, 5, 5, 6, 9};

        // When applying the bubbleSort method to the unsorted array
        SortingAlgorithms.bubbleSort(unsortedArray);

        // Then, check if the array is correctly sorted by comparing it with the expected sorted array
        assertArrayEquals(expectedSortedArray, unsortedArray);
    }
}