package org.example;

import org.junit.jupiter.api.Test;

/**
 * Test class for the Main class to ensure the main method runs without errors.
 */
public class MainApplicationTest {

    /**
     * Test to check if the main method of the Main class runs without errors.
     */
    @Test
    public void main_shouldRunWithoutErrors() {
        // Given a simple test to check if the main method runs without errors
        Main.main(new String[]{});
    }
}