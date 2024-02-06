package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for the ArrayManipulation class.
 */
public class ArrayManipulationTest {

    /**
     * Test the printArray method to ensure it correctly prints the array elements.
     */
    @Test
    public void printArray_shouldPrintArray() {
        // Given an array of integers
        int[] array = {1, 2, 3, 4, 5};

        // Redirect System.out temporarily to capture printed output
        final StringBuilder printedOutput = new StringBuilder();
        System.setOut(new PrintStream(System.out) {
            public void print(String message) {
                printedOutput.append(message);
            }
        });

        // When printing the array using the printArray method
        ArrayManipulation.printArray(array);

        // Reset System.out
        System.setOut(System.out);

        // Then, check if the printed output matches the expected string (ignoring leading/trailing whitespaces)
        String expectedOutput = "1 2 3 4 5" + System.lineSeparator();
        assertEquals(expectedOutput.trim(), printedOutput.toString().trim());
    }
}