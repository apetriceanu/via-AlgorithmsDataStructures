package dk.via;

import org.junit.*;

public class CalculatorTest {
    private Calculator c;

    @Before
    public void setUp() {
        c = new Calculator();
    }


    @Test
    public void processInputFirstTest() {
        c.calculate("4 7 2 + *");
        System.out.println(c.getStackContents());
    }

}