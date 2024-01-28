package homeworks.calculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    static Calculator c;

    @BeforeAll
    public static void setUp() {
        System.out.println("Set up testing variables");
        c = new Calculator();
    }

    @BeforeEach
    public void beforeMethod() {
        System.out.println("This method runs before each test");
    }

    @Test
    public void testAddition() {
        System.out.println("Verify addition works as expected");
        assertEquals(8, c.compute(5, 3, "+"), 0.1);
    }

    @Test
    public void testSubtraction() {
        System.out.println("Verify subtraction works as expected");
        assertEquals(2, c.compute(5, 3, "-"), 0.1);
    }

    @Test
    public void testMultiplication() {
        System.out.println("Verify multiplication works as expected");
        assertEquals(15, c.compute(5, 3, "*"), 0.1);
    }

    @Test
    public void testDivision() {
        System.out.println("Verify division works as expected");
        assertEquals(2, c.compute(6, 3, "/"), 0.1);
    }

    @Test
    public void testDivisionByZero() {
        System.out.println("Verify division by zero throws IllegalArgumentException");
        Assertions.assertThrows(IllegalArgumentException.class, () -> c.compute(10, 0, "/"));
    }

    @Test
    public void testSquareRoot() {
        System.out.println("Verify square root works as expected");
        assertEquals(3, c.compute(9, 0, "SQRT"), 0.1);
    }



    @Test
    public void testInvalidFirstParameter() {
        System.out.println("Verify NumberFormatException is thrown for invalid first parameter");
        Assertions.assertThrows(NumberFormatException.class, () -> c.compute(Double.parseDouble("abc"), 2, "+"));
    }

    @Test
    public void testInvalidSecondParameter() {
        System.out.println("Verify NumberFormatException is thrown for invalid second parameter");
        Assertions.assertThrows(NumberFormatException.class, () -> c.compute(5, Double.parseDouble("xyz"), "+"));
    }

    @Test
    public void testInvalidBothParameters() {
        System.out.println("Verify NumberFormatException is thrown for invalid both parameters");
        Assertions.assertThrows(NumberFormatException.class, () -> c.compute(Double.parseDouble("abc"), Double.parseDouble("xyz"), "+"));
    }

    @AfterEach
    public void afterMethod() {
        System.out.println("This method runs after each test");
    }

    @AfterAll
    public static void cleanUp1() {
        System.out.println("Clean up Testing variables");
        c = null;
    }
}
