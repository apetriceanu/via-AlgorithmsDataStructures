package dk.via;

import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator c;

    @Before
    public void setUp() {
        c = new Calculator();
    }

    // zero

    @Test
    public void emptyExpressionProducesZero() {
        assertEquals(0, c.calculate(""));
    }

    @Test
    public void expressionOfOneNumberProducesZero() {
        assertEquals(0, c.calculate("42"));
    }

    @Test
    public void expressionOfTwoNumbersProducesZero() {
        assertEquals(0, c.calculate("25 25"));
    }

    // one

    @Test
    public void expressionOfTwoNumbersAndOperatorDoesTheCalculation() {
        assertEquals(43, c.calculate("40 3 +"));
        assertEquals(43, c.calculate("3 40 +"));
        assertEquals(120, c.calculate("3 40 *"));
        assertEquals(120, c.calculate("40 3 *"));
    }

    @Test
    public void expressionContainingNegativeNumberWorks() {
        assertEquals(-25, c.calculate("-5 5 *"));
    }

    @Test
    public void expressionContainingTwoNegativeNumbers() {
        assertEquals(25, c.calculate("-5 -5 *"));
    }

    // multiple

    @Test
    public void expressionWithMultipleOperands() {
        assertEquals(36, c.calculate("4 7 2 + *"));
    }

    @Test
    public void multipleOperandsContainingZero() {
        assertEquals(0, c.calculate("5 2 2 - *"));
    }

    @Test
    public void expressionWithThreeOperansa() {
        assertEquals(17, c.calculate("3 4 7 * 2 / +"));
    }

    // boundary

    @Test(expected = ArithmeticException.class)
    public void letsSeeWhatHappensWhenWeDivideByZero() {
        assertEquals(0, c.calculate("1 0 /"));
    }

    @Test
    public void everythingIsZero() {
        assertEquals(0, c.calculate("0 0 *"));
    }
}