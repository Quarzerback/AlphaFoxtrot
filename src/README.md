# Array Manipulation and Sorting Algorithms

This project provides a simple implementation of array manipulation and sorting algorithms in Java.

## Project Structure

- `src/main/java/org/example/` : Contains the main Java classes for array manipulation and sorting algorithms.
    - `ArrayManipulation.java`: Utility class for array manipulation operations.
    - `SortingAlgorithms.java`: Class containing sorting algorithms.
    - `Main.java`: Main class to demonstrate array manipulation and sorting algorithms.

- `src/test/java/org/example/` : Contains the JUnit test classes for the main Java classes.
    - `ArrayManipulationTest.java`: Tests for the `ArrayManipulation` class.
    - `SortingAlgorithmsTest.java`: Tests for the `SortingAlgorithms` class.
    - `MainApplicationTest.java`: Test for the `Main` class to ensure the main method runs without errors.

## Usage

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/array-manipulation.git
   cd array-manipulation
   ```

2. Compile and run the program:

   ```bash
   javac -cp src src/main/java/org/example/Main.java
   java -cp src org.example.Main
   ```

   This will demonstrate array manipulation and sorting algorithms.

3. Run tests:

   ```bash
   javac -cp src:test $(find . -name "*.java")
   java -cp src:test org.junit.platform.console.ConsoleLauncher --scan-classpath
   ```

   This will run JUnit tests and ensure the functionality is correct.

## Dependencies

- Java (JDK 8 or later)
- JUnit 5

## License

This project is licensed under the MIT License - see the LICENSE file for details.