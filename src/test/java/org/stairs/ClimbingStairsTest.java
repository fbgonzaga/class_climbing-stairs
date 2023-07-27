package org.stairs;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsTest {
    private static ClimbingStairs climbingStairs;

    @BeforeAll
    static void beforeAll() {
        climbingStairs = new ClimbingStairs();
    }

    @Test
    void calculateStairs1Steps2() {
        assertEquals(1, climbingStairs.calculate(1, 2));
    }

    @Test
    void calculateStairs2Steps2() {
        assertEquals(2, climbingStairs.calculate(2, 2));
    }

    @Test
    void calculateStairs3Steps2() {
        assertEquals(3, climbingStairs.calculate(3, 2));
    }

    @Test
    void calculateStairs4Steps3() {
        assertEquals(7, climbingStairs.calculate(4, 3));
    }
}