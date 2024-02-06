package org.example;

public class SortingAlgorithms {

    public static void bubbleSort(int[] array) {
        int length = array.length;
        boolean swapped;

        do {
            swapped = false;

            for (int i = 1; i < length; i++) {
                if (array[i - 1] > array[i]) {
                    ArrayManipulation.swap(array, i - 1, i);
                    swapped = true;
                }
            }
            length--;
        } while (swapped);
    }
}