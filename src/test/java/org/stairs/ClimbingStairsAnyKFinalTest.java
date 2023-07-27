package org.stairs;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsAnyKFinalTest {
    private static ClimbingStairsAnyK climbingStairsAnyK;

    @BeforeAll
    static void beforeAll() {
        climbingStairsAnyK = new ClimbingStairsAnyKFinal();
    }

    @Test
    void calculateStairs1Steps2() {
        assertEquals(1, climbingStairsAnyK.calculate(1, 2));
    }

    @Test
    void calculateStairs2Steps2() {
        assertEquals(2, climbingStairsAnyK.calculate(2, 2));
    }

    @Test
    void calculateStairs3Steps2() {
        assertEquals(3, climbingStairsAnyK.calculate(3, 2));
    }

    @Test
    void calculateStairs4Steps3() {
        assertEquals(7, climbingStairsAnyK.calculate(4, 3));
    }
}