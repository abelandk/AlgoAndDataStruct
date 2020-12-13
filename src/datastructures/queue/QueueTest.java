package datastructures.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    Queue<Integer> q;
    @BeforeEach
    void setUp() {
        q = new Queue<Integer>(10);
    }

    @Test
    void add() {
        assertEquals(q.peek(), 10);
        q.add(11);
        assertEquals(q.peek(), 10);
    }

    @Test
    void remove() {
        q.remove();
        q.add(11);
        assertEquals(q.peek(), 11);
    }

    @Test
    void peek() {
        assertEquals(q.peek(), 10);
    }

    @Test
    void isEmpty() {
        assertEquals(q.isEmpty(), false);
        q.remove();
        assertEquals(q.isEmpty(), true);
    }
}