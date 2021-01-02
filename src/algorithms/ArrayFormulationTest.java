package algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFormulationTest {


    ArrayFormulation arrayFormulation;
    @BeforeEach
    void setUp() {
    }

    @Test
    void test() {
        arrayFormulation = new ArrayFormulation();
        assertTrue(arrayFormulation.canFormArray(new int []{85}, new int [][]{{85}}));
        assertTrue(arrayFormulation.canFormArray(new int []{15, 88}, new int [][]{{88}, {15}}));
        assertFalse(arrayFormulation.canFormArray(new int []{91,4,64,78}, new int [][]{{78},{64,4},{91}}));
    }

}