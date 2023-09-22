package org.stairs;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsV1Test {
    private static ClimbingStairs climbingStairs;

    @BeforeAll
    static void beforeAll() {
        climbingStairs = new ClimbingStairsV1();
    }

    @Test
    public void testN1(){
        assertEquals(1, climbingStairs.calculate(1));
    }

    @Test
    public void testN2(){
        assertEquals(2, climbingStairs.calculate(2));
    }

    @Test
    public void testN3(){
        assertEquals(3, climbingStairs.calculate(3));
    }

    @Test
    public void testN4(){
        assertEquals(5, climbingStairs.calculate(4));
    }

    @Test
    public void testN10(){
        assertEquals(89, climbingStairs.calculate(10));
    }
}