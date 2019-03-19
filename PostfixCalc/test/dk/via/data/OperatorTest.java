package dk.via.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OperatorTest {
    Operator o;

    @Before
    public void setUp() throws Exception {
        o = new Operator("+");
    }

    @Test
    public void isOperator() {
        assertTrue(o.isOperator());
    }

    @Test
    public void testToString() {
        assertEquals("+", o.toString());
    }
}