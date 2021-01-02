package algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcSumTest {

    int targetSum;
    int [] nums;

    CalcSum calcSum;
    @BeforeEach
    void setUp() {
    }

    @Test
    void calcSumTest() {
        targetSum = 7;
        nums = new int[]{2, 3};
        calcSum = new CalcSum(targetSum, nums);
        assertTrue(calcSum.isFound());
    }

    @Test
    void calcSumTest1() {
        targetSum = 7;
        nums = new int[]{5, 3, 4, 7};
        calcSum = new CalcSum(targetSum, nums);
        assertTrue(calcSum.isFound());
    }

    @Test
    void calcSumTest2() {
        targetSum = 7;
        nums = new int[]{2, 4};
        calcSum = new CalcSum(targetSum, nums);
        assertFalse(calcSum.isFound());
    }

    @Test
    void calcSumTest3() {
        targetSum = 8;
        nums = new int[]{2, 3, 5};
        calcSum = new CalcSum(targetSum, nums);
        assertTrue(calcSum.isFound());
    }

    @Test
    void calcSumTest4() {
        targetSum = 300;
        nums = new int[]{7, 14};
        calcSum = new CalcSum(targetSum, nums);
        assertFalse(calcSum.isFound());
    }

}