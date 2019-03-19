import dk.via.stack.MyStack;
import org.junit.*;
import static org.junit.Assert.*;

public class MyStackTest {
    private MyStack s;

    @Before
    public void setUp() {
        s = new MyStack();

    }

    @After
    public void tearDown() {

    }

    // zero

    @Test
    public void emptyStackHasSizeZero() {
        assertEquals(0, s.size());
    }

    @Test
    public void emptyStackIsEmpty() {
        assertTrue(s.isEmpty());
    }

    @Test
    public void poppingNothingReturnsNull() {
        assertNull(s.pop());
    }

    @Test
    public void peekingAtEmptyStackReturnsNull() {
        assertNull(s.peek());
    }

    // one

    @Test
    public void addingAnItemIncreasesStackSize() {
        s.push(42);
        assertEquals(1, s.size());
    }

    @Test
    public void addingAnElementStackNotEmpty() {
        s.push(42);
        assertFalse(s.isEmpty());
    }

    @Test
    public void oneElementCanBePeekedAt() {
        s.push(42);
        assertEquals(42, s.peek());
    }

    @Test
    public void oneElementCanBePopped() {
        s.push(42);
        assertEquals(42, s.pop());
    }

    @Test
    public void popAnElementAndSizeDecreases() {
        s.push(42);
        s.pop();
        assertEquals(0, s.size());
    }

    // multiple

    @Test
    public void addTwoElementsIncreasesSizeToTwo() {
        s.push(42);
        s.push(43);
        assertEquals(2, s.size());
    }

    @Test
    public void addTwoElementsAndLastOneIsPeeked() {
        s.push(42);
        s.push(43);
        assertEquals(43, s.peek());
    }

    @Test
    public void sizeDoesNotChangeWhenPeeking() {
        s.push(42);
        s.push(43);
        s.peek();
        assertEquals(2, s.size());
    }

    @Test
    public void addMultipleElementsAndGetThemBackInReverseOrder() {
        s.push(42);
        s.push(43);
        assertEquals(43, s.pop());
        assertEquals(42, s.pop());
    }

    // boundaries

    @Test
    public void pushingZeroStillCounts() {
        s.push(0);
        assertEquals(0, s.pop());
    }

    // exceptional behaviour

    @Test
    public void pushingNullDoesNotCount() {
        s.push(null);

        assertTrue(s.isEmpty());
    }
}