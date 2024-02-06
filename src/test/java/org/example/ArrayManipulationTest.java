package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayManipulationTest {

    @Test
    public void printArray_shouldPrintArray() {
        int[] array = {1, 2, 3, 4, 5};

        // Redirect System.out temporarily to capture printed output
        final StringBuilder printedOutput = new StringBuilder();
        System.setOut(new java.io.PrintStream(System.out) {
            public void print(String message) {
                printedOutput.append(message);
            }
        });

        ArrayManipulation.printArray(array);

        // Reset System.out
        System.setOut(System.out);

        // Check if the printed output matches the expected string (ignoring leading/trailing whitespaces)
        String expectedOutput = "1 2 3 4 5" + System.lineSeparator();
        assertEquals(expectedOutput.trim(), printedOutput.toString().trim());
    }
}