package dk.via.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {
    private Number n;
    @Before
    public void setUp() {
        n = new Number("4");
    }

    @Test
    public void isOperator() {
        assertFalse(n.isOperator());
    }

    @Test
    public void testToString() {
        assertEquals("4", n.toString());
    }
}