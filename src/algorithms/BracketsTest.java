package algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BracketsTest {


    Brackets brackets;
    @BeforeEach
    void setUp() {
    }

    @Test
    void test1() {
        brackets = new Brackets("[{}]");
        assertTrue(brackets.isMatch());
    }

    @Test
    void test2() {
        brackets = new Brackets("(()())");
        assertTrue(brackets.isMatch());
    }

    @Test
    void test3() {
        brackets = new Brackets("{]");
        assertFalse(brackets.isMatch());
    }

    @Test
    void test4() {
        brackets = new Brackets("[()]))()");
        assertFalse(brackets.isMatch());
    }

    @Test
    void test5() {
        brackets = new Brackets("[]{}({})");
        assertTrue(brackets.isMatch());
    }
}