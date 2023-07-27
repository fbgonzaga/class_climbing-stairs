package org.stairs;

public class ClimbingStairsV2 implements ClimbingStairs {
    @Override
    public int calculate(int n) {
        int a = 1;//i-1 (initially F0)
        int b = 1;//i (initially F1)

        for (int i = 2; i <= n; i++) {
            b += a;
            a = b-a;
        }

        return b;
    }
}
