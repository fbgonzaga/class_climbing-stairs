package org.stairs;

public class ClimbingStairsV1 implements ClimbingStairs {
    @Override
    public int calculate(int n) {
        int stairCase[] = new int[n+1];

        stairCase[0] = 1;
        stairCase[1] = 1;

        for (int i = 2; i <= n; i++) {
            stairCase[i] = stairCase[i-1] + stairCase[i-2];
        }

        return stairCase[n];
    }
}
