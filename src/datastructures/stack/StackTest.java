package datastructures.stack;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack<Integer> s;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        s = new Stack<>(10);
    }

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(s.peek(), 10);
        s.add(11);
        assertEquals(s.peek(), 11);
    }

    @org.junit.jupiter.api.Test
    void pop() {
        assertEquals(s.peek(), 10);
        s.pop();
        assertTrue(s.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void peek() {
        assertEquals(s.peek(), 10);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        s.pop();
        assertTrue(s.isEmpty());
    }
}