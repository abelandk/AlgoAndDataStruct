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
        assertTrue(s.peek() == 10);
        s.add(11);
        assertTrue(s.peek() == 11);
    }

    @org.junit.jupiter.api.Test
    void pop() {
        assertTrue(s.peek() == 10);
        s.pop();
        assertTrue(s.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void peek() {
        assertTrue(s.peek() == 10);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        s.pop();
        assertTrue(s.isEmpty());
    }
}