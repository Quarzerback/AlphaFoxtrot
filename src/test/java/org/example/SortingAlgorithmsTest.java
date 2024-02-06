package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingAlgorithmsTest {

    @Test
    public void bubbleSort_shouldSortArray() {
        int[] unsortedArray = {5, 2, 9, 1, 5, 6};
        int[] expectedSortedArray = {1, 2, 5, 5, 6, 9};

        SortingAlgorithms.bubbleSort(unsortedArray);

        assertArrayEquals(expectedSortedArray, unsortedArray);
    }
}