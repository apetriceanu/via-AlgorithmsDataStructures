package dk.via;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator c;

    @Before
    public void setUp() {
        c = new Calculator();
    }


    @Test
    public void processInputFirstTest() {
        c.processInput("3 80 2 / +");
        System.out.println(c.getStackContents());
        System.out.println(c.calculate());



    }

}